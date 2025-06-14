package clsex;

public class PeopleTester {
    public String codeNma = "피플";

    public void test(){
        PeopleTester.changePigNmae();
    }

    public static void changePigNmae(Pig pig, String name){ // Pig pig = p1 ;
        pig.setName(name);
    }

    public static void main(String[] args) {

        
//       People p1 = new People(); // 추상 클래스는 인스턴스화 할수 없음

//      People p1 = new People();// 추상 클랙스 바로 가져다 사용 불가

//        int[] arr = new int[3];
        People[] myArr = new People[3]; // 배열만 만들지 생성자 추가하는것 아님

        myArr[0] = new American();
        myArr[1] = new Korean();
        myArr[2] = new Japanese();
//
//        for(Object obj : myArr){
//            People p = (People) obj;
//            p.say();
//        }
//        American a1 = new American();
//        Korean k1 = new Korean();
//        Japanese j1 = new Japanese();

//        a1.say();
//        k1.say();
//        j1.say();

        // Animal Class 를 상속 받는 모든 클래스에서 공통적으로 아래의 기능을 지원
        Cat c1 = new Cat("뚱뚱이");
        Cat c2 = new Cat(c1.getName()); // 깊은 복사(Deep Copy)

        c1.setName("검둥이");// c1 인스턴스의 이름을 변경해도 c2의 이름이 변경 되지 않음
        
        Cat c3 = c1; // 얕은 복사 > c3 와 c1 원 같은 값을 가진 다른 객체
        c3.setName("흰둥이");
        
        
        Dog d1 = new Dog("뿡뿡이");
        Pig p1 = new Pig("꿀꿀이");

        changePigNmae(p1, "얼룩이");
        System.out.println(p1);
        
        changePigNmae(new Pig("말랑이"), "점백이");
        System.out.println(p1);
        
        

//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(d1);
//        System.out.println(p1);
//
        
        Animal [] arrAni = {c1, d1, p1};// Pig, Cat, Dog, Animal, Object 타입이 존재함 (다형성)
//        Object [] arrObj = {c1, d1, p1};

        for(Animal obj : arrAni){
             obj.cry();
        }

        Animal ac1 = new Cat("호랭이");
        Animal ap2 = new Pig("날씬이");
        Animal ad3 = new Dog("발발이");
        Dog ad5 = (Dog)ad3; // 다형성 이용한 형변환 허용
        ad5.setBirth(10);

        ((Dog)ad3).setBirth(20);
        
        // 주의: 코드상에서는 컴파일 에러가 발생하지 않지만.
        // 반드시 런타임 에러(Exception) 을 발생시킨다
        ad5 = (Dog) ap2;
        ad5.setBirth(20);


//        Calculator calc = new Calculator();
//        calc.add()
        Calculator.add(10,20);

        System.out.println();
//       클래스  인스턴스  메소드

    }
}

// 메모리:
// Stack: 몬드 지역 변수 > Primitive, Referenced,
// Code: 명령문들이 메소드 단위
// Static: 코드(주소), 상수(주소), 변수(주소) > (앞부분에 Static 붙음)
// Heap: 인스턴스