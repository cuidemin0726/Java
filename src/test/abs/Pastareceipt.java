package test.abs;

public class Pastareceipt extends  Receipt{

    public Pastareceipt(String chef){
        super(chef);
    }

    public void makeSource(){
        System.out.println("파스타 소스는 직접 만듭니다~!");
    }


}
