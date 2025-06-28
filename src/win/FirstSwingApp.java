package win;

// swing 라이브러리 있음, 윈도우 App 개발시 필요
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;

public class FirstSwingApp {
    public static final int TEXT_HEIGHT = 30;

    public static void main(String[] args) {

        JFrame frame = new JFrame("자바 스윙 앱"); // 메인 윈도우
        frame.setSize(800,600);          // 에인 윈도우의 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  X 버튼을 클랙했을때 액션 ===> 프로그램 App 종료
        frame.setLayout(null); // 레이아웃을 객체를 사용하지 않음
//        LayoutManager layoutManager = new FlowLayout(FlowLayout.CENTER);

        FallingLabel label = new FallingLabel("텍스트", 10, frame); // 위젯(Weiget), 컴포넌트(Component)
            Thread th = new Thread(label);
            th.start();

//        label.setBounds(10,10,600,50);

        JTextField text = new JTextField();
//        text.setBounds(10,100,600,TEXT_HEIGHT);

        // 메인 위도우가 생성된 이후에 실행하도록 설정
        //메인 윈도우가 나타나기 직전에 실행되도록 처리함
        SwingUtilities.invokeLater(text::requestFocusInWindow); // text에 포커싱을 해라

        // frame(메인 윈도우) 의 이벤트 리스너를 설정
        frame.addComponentListener(new ComponentListener() {

            // 윈도우의 사이즈가 변경 되면 실행(이벤트 발생)
            @Override
            public void componentResized(ComponentEvent e) {
                // text 위젯을 메인 윈도우 하단에 고정 시키기
                int y = frame.getContentPane().getHeight() - TEXT_HEIGHT;
                text.setBounds(0, y, frame.getWidth(), TEXT_HEIGHT);
            }
            
            @Override
            public void componentMoved(ComponentEvent e) {} // 메인 윈도우가 이동 되었을때 실행

            @Override
            public void componentShown(ComponentEvent e) {} // 메인 윈도우가 보여졌을때 실행

            @Override
            public void componentHidden(ComponentEvent e) {}// 메인 윈도우가 감춰졌을때 실행

        });

        text.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                // text에서 엔터키가 눌렸으면
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    // 입력된 글자와 같은 라벨을 지움
                    //
                    String inputText = text.getText();
                    System.out.println(inputText);

                    text.setText("");// text 클리어
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });


        frame.add(label);
        frame.add(text);


//        JButton button1 = new JButton("변경");
//        button1.setBounds(10,200,600,50);
//        button1.addActionListener((event)->{
//            label.setText(text.getText());
//        });
//
//        JButton button2 = new JButton("클리어");
//        button2.setBounds(10,300,600,50);
//        button2.addActionListener((event)->{
//            text.setText("");
//        });



//        button.addActionListener();


//        frame.add(button1);
//        frame.add(button2);

        // 윈도우를 보이게 함
        frame.setVisible(true);
    }
}
