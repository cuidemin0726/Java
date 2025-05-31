package cls;

import java.util.Random; // Random 클래스를 사용하기 위해 이파일에 import 시캄

public class MyPersonTest {
    public static void main(String[] args) {
        //primitive type: byte, char, short, int, long, float, double, boolean
        // referenced type: String, ...

        Random rand = new Random();
        // Person > 클래스임
        // k1: Object(객체 > 인스턴스(instance)라고 많이 부름)
        // 클래스명 객체명 = new 생성자;
        Person k1 = new Person(); // Person 클래스로부터 k1 인스턴스가 생성되며, 생성자가 자동으로 호출됨.



        k1.increaseAge();
        k1.setGender("남성");
        k1.setGender("남자");
        k1.introduce();
        int k1_age = k1.getAge();
        System.out.println(k1_age);


        Person k2 = new Person("홍길동", 18);
        k2.introduce();

    }
}
