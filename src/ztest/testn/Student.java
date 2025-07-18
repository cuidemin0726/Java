package ztest.testn;

public class Student {

    private  int age;
    private String myName;
    private String school;

    //기본 생성자
    public Student(){

    }

    // 생성자를 통해서 데이터를 받고 싶을때
    public Student(int age, String myName){
        this.age = age;
        this.myName = myName;

    }


    // 오버로드
    public Student(int age, String myName, String school){
        this(age, myName);
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
