package test.inter2;

public class NewMic implements BlutoohMIC2 {

    @Override
    public void music(){
        System.out.println("마이크에 장착된 스피커에서 소리가 나옴");
    }

    @Override
    public void sing(){
        System.out.println("마이크에 대고 노래 부름");
    }
}

