package intfaces;

public class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.name);

        Tiger tiger = new Tiger();
        outer.animalCry(tiger);

        //outer.animalCry(/*Animal interface를 구현한 클래스로 생성 된 임스턴스*/);
        //익명클래스: 이름 없는 클래스 = 즉석
        outer.animalCry(new Animal() {
            @Override
            public void cry() {
                System.out.println("야옹야옹 익명클래스");
            }

            @Override
            public void go() {}
        });

          /*
        * Animal() {
            @Override
            public void cry() {
                System.out.println("야옹야옹 익명클래스");
            }
        }*/

        // 함수형 프로그래밍 방식
        // Lambda Expression; 람다 표현식 > Funtionalinterface에서만 사용 가능
        outer.animalGo( (food)-> {
            System.out.println("남남 " + food);
            //...
        });

//        outer.animalGo(new Creature() {
//            @Override
//            public void eat() {
//                System.out.println("냠냠");
//            }
//        });





        // class name | inst.name = inst.new 내부 클래스 생성자;
           Outer.Inner    inner =  outer.new Inner();
        System.out.println(inner.name);
    }
}
