package test.member.cls;

public class Unit {
    private  int speed = 10;

    public void getUnit(String type, String unitName){
//        unitName = unitName+"님";

        class Tank{
            public void move(){
                System.out.println(unitName +"이(가)" + speed + " 속도로 이동~!");
            }
        }
        class Ship{
            public void move(){
                System.out.println(unitName +"이(가)" + speed + " 속도로 이동~!");
            }
        }
        Tank t = null;
        Ship s = null;
        if(type.equals("ship")){
            s = new Ship();
            s.move();
        }else if(type.equals("tank")){
            t = new Tank();
            t.move();
        }
    }
}
