package intfaces;

public class Outer {

    public String name;
    public Outer(){
        name = "외부 클래스";
    }

    public void animalCry(Animal ani){
        ani.cry();
    }

    public void animalGo(Creature ani){
        ani.eat("고기");
    }


    // 이런 방법은 잘 사용하지 않음
    public class Inner{
        public String name;
        public Inner(){
            name = "내부클래스";
        }
    }


}
