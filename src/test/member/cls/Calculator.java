package test.member.cls;

public class Calculator {
    private  int val1;
    private int val2;

    public  Calculator(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    //내부 클랙스 - 인스턴스 클래스 선언
    // 인스턴스 클래스는 외부 클래스의 변수/메서드 사용가능
    public class Calc{
        public int add(){
            return  val1 + val2;
        }
    }

//    public  Calc getCalc(){
//        Calculator.Calc cal = new Calc();
//        return cal;
//    }

}
