package cls;

//Marine : Steampack
// Tank: 공격력 +20, 체력 + 100



// 필드(Field): 맴버 변수 정수형으로 hp, power
//메소드(method) : 맨버 변후
// 매개변후(Parameter, Argument, 인수,) : 메소드에서 외부로 부터 주어지 는 입력값으로 초기화 되는 변수
// 매개변수가 정의되는 곳은 메소드형([매개변수들...]}


public class MyUnit {
    private int     hp;
    private int    power;
    private String name;


   // hp 는 100, power 100으로 서정하는 기본 생성자를 만드세요.
    public MyUnit (){
        hp = 100;
        power = 100;
        name = "이름 없음";
    }

    // 외부로부터 hp와 power를 입력받아서 맴버 hp와 powerfmf 설정하는 생성자
    public MyUnit(String name, int hp, int power){
        this.hp = hp;
        this.power = power;
        this.name = name;
    }

    // 반환값이 없는 메소드 damage를 만드세요
    // 매개변후로 power(정수형)가 주어지고
    // 맴버변수 hp를 매개변후 power만큼 차감합니다
    // hp에서 power를 차감한 값이 음수 이면 hp는 0으로 설정합니다.
    public void damage(int power){
        hp -= power;
        if(hp < 0) {
            hp = 0;
        }
    }
    public void attack(MyUnit target) {
        target.damage(power);
    }

    // 외부 호출 가능하도록
    // hp 와 power를 출력하는 메소드 info를 만드세요
    public void info(){
        System.out.printf("[%s] hp: %d, power: %d \n",name, hp, power);
    }

//    public void steampack(){
//        power += 10;
//    }

    public void setPower(int power) {
        this.power = power;
    }
    public int getPower(){
        return power;
    }
}
