package ztest;

public class Student {

    static String school = "자바학교";

    String myName;
    int grade;

    void schoolInfo(){
        System.out.println("저는 " + this.myName +"이고 학교는 " + school + " 이다");
    }
}
