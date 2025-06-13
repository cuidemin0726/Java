package test.person;

public class PerMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.introduce();

//        String a = "한글";

        // 익명 클래스
        Person p2 = new Person() {
            @Override
            public void introduce() {
//                a = "멋진" +a ;
                System.out.println(" 나는 생각하는 사람~!");
            }
        };
        p2.introduce();
    }

}
