package ztest.Cars;

public class TypeTestMain {
    public static void main(String[] args) {

        Bus b = new Bus("버스");
        Taxi t1 = new Taxi("개인택시");

        Car car = t1; // 형변환

        b. getInfo();
        t1.getInfo();

        // 부모타입으로 형변환 되면 자식 클래스가 가진 기능이나 속성을 사용할수 없음.
        //car.getInfo();

        Taxi t2 = (Taxi)car;
        t2.getInfo();

    }
}
