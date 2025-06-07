package cls;

public class BankTest {
    public static void main(String[] args) {
        BankAccount m1 = new BankAccount();
        BankAccount m2 = new BankAccount();
        m1.deposit(1000);
        m1.withdraw(1000);
        m1.withdraw(2000);
        m1.withdraw(3000);

        if(m2.equals(m1)){
            System.out.println("m1 과 m2는 같다");
        }else
            System.out.println("m1 과 m2는 다르다");

//        BankAccount m2 = new BankAccount();
//        m2.view();

        int w1 = 10;
        int w2 = 10;

        if(w1 == w2){
            System.out.println("w1 과 w2는 같다");
        }else
            System.out.println("w1 과 w2는 다르다");
    }
}
