package ztest;

public class StudentMain {
    public static void main(String[] args) {

        Student st01 = new Student();
        Student st02 = new Student();

        st01.myName = "홍길동";
        st02.myName = "김길동";

        st01.schoolInfo();
        st02.schoolInfo();
        System.out.println("나의 학교는 " + Student.school);


    }
}
