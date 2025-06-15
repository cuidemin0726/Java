package ztest.override;

public class Samsong extends Computer{

    public void poweron(){
        super.poweron();
        System.out.println("헬로!!삼송!");
        System.out.println("컴퓨터 실행됩니다~!");
    }

    public void poweroff() {
        super.poweroff();
        System.out.println("굿바이!!삼송!");
        System.out.println("컴퓨터 종료됩니다~!");
    }

}
