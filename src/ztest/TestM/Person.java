package ztest.TestM;

public class Person {

    private  int age;
    private String myName;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("입력ㄱ밧이 잘못되었습니다~!");
            return;
        }
        this.age = age;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
