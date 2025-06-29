package win;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordManager {
    // FallingLabel 인스턴스들을 저장하는 리스트
    private ArrayList<FallingLabel> labelArray;
    
    private List<String> wordArray;
    private  JFrame parent;

    public WordManager(JFrame parent){
        this.parent = parent;
        labelArray = new ArrayList<>();
    }

    public JFrame getParent(){
        return  parent;
    }

    public void initWords(String fileName) throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            Gson gson = new Gson();
            
            // JSON  형식으로 부터 리스트를 읽기 위한 타입 생성
            Type type = new TypeToken<List<String>>(){}.getType();
            wordArray = gson.fromJson(reader,type); // 위에서 생성한 타임형식의 리스트를 읽음(list 인스턴스가 생성됨)
            wordArray.forEach(System.out::println);
        }
    }

    public void add(){
//        int index = (int) (Math.random() * wordArray.size());
        Random rand = new Random();
        int index = rand.nextInt(wordArray.size());
        String randomText = wordArray.get(index);

        int speed = rand.nextInt(2, 11);

        // 덜어지는 라벨 생성
        FallingLabel label = new FallingLabel( randomText,speed, this); // 위젯(Weiget), 컴포넌트(Component)
        parent.add(label); // 라벨을 메인 윈도우에 추가 시킴
        Thread th = new Thread(label); // 떨어드리는  Thread를 생성
        th.start(); // Thread를 구동 시킴

        // FallingLabel 인스턴스 저장 배열에서 관리
        labelArray.add(label);
    }

    public boolean remove(String text){
        // 리스트에서 매개변수로 주어지는 text와 비교하여 FallingLabbel 인스턴스를 찾아서 삭제함
        for( FallingLabel label: labelArray){
            if(label.getText().equals(text)){
                labelArray.remove(label); // 리스트에서 삭제
                parent.remove(label); // 윈도우에서 삭제
                parent.repaint();       // 메인윈도우를 다시 그림(윈도우 갱신)
                return true;
            }
        }

        return false;

    }

    public void remove(FallingLabel label){
        labelArray.remove(label);
        parent.remove(label); // 윈도우에서 삭제
        parent.repaint();       // 메인윈도우를 다시 그림(윈도우 갱신)
    }
}
