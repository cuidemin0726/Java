package clsex;
// 추상 클래스(abstract 클래스), 약속을 하기위한 사전 클랙스라고 보면 됨
public abstract class People {

    public People(){
        System.out.println("People 생성자가 호출 됨");
    }

//    public void say(){
//        System.out.println("안녕하세요~!");
//    }
    // 추가 메소드, 가상 메소드(abstract method)
    public abstract void say();
//    public abstract void cry();

//    public abstract void test();
    
    public void go(){
        System.out.println("사람이 갑니다!!!");
    }

}
