package test.member.cls;

public class PrintOut {

//    private String line = "\n";
    // 정적클래스 선언
    public static class out{
        public  void  printIn(String str){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        PrintOut.out out = new PrintOut.out();
        String str = "정적내부클래스";

        out.printIn(str);
    }
}
