package intfaces;

// interface 클래스는 구현한다고 함
public class Tiger implements Animal, Creature{

    //from Animal
    @Override
    public void cry() {
        System.out.println("어흥흥");

    }

    //from Animal
    @Override
    public void go() {

    }

    // from Creature
    @Override
    public void eat(String food){

    }

}
