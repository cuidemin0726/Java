package clsex;

// 추상 클래스()
public abstract class Animal {
    private String name;

    //생성자(Constructor)
    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // 추상 메소드
    public abstract void cry();

   // Animal 클래스를 상속하는 Pig, Dog, Cat 클래스를 만들고 cry()를 각각 구현하세요
    //cry() 메소드에서
    // Pig 는 꿀굴
    // Dog 는 멍멍
    // Cat 는 야옹

    @Override
    public String toString() {
//        return String.format("%s",name);
        return name;
    }
}
