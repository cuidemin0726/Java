package intfaces;

// interface 클래스는 구현한다고 함
public class Tiger implements Animal, Creature{

    //from Animal
    @Override
    public void cry() {

    }

    //from Animal
    @Override
    public void go() {

    }

    // from Creature
    public void eat(){

    }

}
