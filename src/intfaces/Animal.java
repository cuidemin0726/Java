package intfaces;

// interface: 추상 클래스들로만 만들어진 특별한 클래스, 개발자들간의 어떤 약속을 하기 위한 특별한 클래스
// GUI : Graphic User Interface
// CLI : Command Line Interface

public interface Animal {
    public static final String name = "동물"; // final 상수: 공개된 공통의 상수만 속성으로 가질수 있다, 더이상 변경할수 없음

    public void cry();
    public void go();
//    public void eat();

}
