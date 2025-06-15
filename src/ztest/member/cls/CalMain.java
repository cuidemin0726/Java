package ztest.member.cls;

public class CalMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator(12, 20);
        // 내부 클래스 선언
        Calculator.Calc calc = cal.new Calc();

        //내부클래스 메서드 실행
        System.out.println("더하기 값: " + calc.add());
//        System.out.println("더하기 값: " + cal.getCalc().add());

    }
}
