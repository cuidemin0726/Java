package cls;

public class MyIntTester {
    public static void main(String[] args) {
        // 정수 데이터 10을 갖는 MyInt 형 인스턴스 1개와
        // 정수 데이터 20을 갖는 MyInt 형 인스턴스 1개를 생성하세요.
        // 클래스명 인스턴스 명 = new 셍성자;
        MyInt n1 = new MyInt(10);
        MyInt n2 = new MyInt();
        n2.setN(10);

        System.out.println(n1);
        System.out.println(n2);
        
        if(n1.equals(n2))
            System.out.println("n1 과 n2 는 동일");
        else
            System.out.println("n1 과 n2 는 다름");



    }
}
