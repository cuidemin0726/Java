package ztest.abs;

public abstract class Phone {

    //추상화 메서드
    public abstract void openingLogo();

    public void powerOn(){
        this.openingLogo();// 자식클래스가 정의한 메서드내용이 출력
        System.out.println("핸드폰이 켜짐~!!");
    }
    public void powerOff(){
        System.out.println("핸드폰이 꺼짐~!!");
    }
    
}
