package win;

import javax.swing.*;
import java.awt.*;

public class FallingLabel extends JLabel implements Runnable {

    private int x;  // 라벨의 X 좌표
    private int y;  // 라벨의 현재 y 좌표
    private int speed;  // 덜어지는 속도
//    private JFrame parent; // 부모 윈도우(라벨이 놓여진 윈도우)
    private WordManager mgr;


    public FallingLabel(String text, int speed, WordManager mgr){
        super(text);

        // 폰트 생성
        Font font = new Font("맑은 고딕", Font.BOLD, 20);
        setForeground(new Color(255,255,255));
        setFont(font); // 라벨의 폰트를 지정함

        setSize(getPreferredSize());// 글자 크기에 맞게 라벨의 넓이봐 높이를 맞춤

        this.mgr = mgr;
        this.speed = speed;
        y = 0;
        x = (int) (Math.random() * (mgr.getParent().getWidth()- getWidth())); // x 좌표는 부모 윈도우의 넓이를 기준으로 랜덤하게 위치 시킴

    }

    @Override
    public void run() {
        while (true){
            y += speed;

            SwingUtilities.invokeLater(()->{
                setLocation(x,y); // x, y 의 좌표로 이동 시킴
            });

            if( y > mgr.getParent().getHeight())
                break;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("라벨 스레드가 종료됨!");
//        parent.remove(this); // 이 라벨이 메인 윈도우에서 제거 됨
        mgr.remove(this);

    }

}
