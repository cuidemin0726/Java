package clsex;

public class Cat extends Animal{
    public Cat(String name){
        super(name); // 부모 클래스의 생성자를 호출하는것
    }
    
    public void cry(){
        System.out.println("야옹");
    }



}
