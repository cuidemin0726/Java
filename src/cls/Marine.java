package cls;


// 상속되어진 클래스 ===> 자식 클래스, 파생 클래스
// 여기에서 MyUnit 클래스는 Marine의 부모클래스, 슈퍼 클래스

public class Marine extends MyUnit {

    public Marine(String name, int hp, int power){
        super(name, hp, power);// 부모 클래스의 생성자를 호출(변수명 순서 동일해야 함)
    }

    public void steampack(){
//        int power = getPower();
//        setPower( power + 10);
         setPower(getPower() + 10);
    }

}
