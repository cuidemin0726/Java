package test.abs;

public abstract class Receipt {

    public String chef;

    public Receipt(String chef){
        this.chef = chef;

    }

    public void info(){
        System.out.println("이 레시피는 " + this.chef + "의 것이다~!");
    }
}
