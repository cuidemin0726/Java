package cls;

public class BankAccount {
    private int money;

    public BankAccount(){
        money = 0;
    }

    public BankAccount(int money){
        this.money = money;
    }

    // 외부에서 접근 가능한  view 라는 메소드를 작성하세요.
    // 반환값 없음, 매개변수 없음
    // 외부에서 view를 오출하면 다음과 같은 결과 출력 되어야합니다.
    // Balance: xxxxxx 원
    public void view(){
        System.out.printf("Balance: %d 원\n", money);
    }
    //외부에서 접근 가능한 deposit 라는 메소드를 작성
    // 반환값은 없고, 매개변수 money이고, 필드 money 값을 매개변수 money의 값으로 누적시킴.
    // deposit: XXXXX원
    // Balance: xxxxxx 원
    public void deposit(int money){
        this.money += money;
        System.out.printf("Deposit: %d 원\n", money);
        view();
    }

    // withdraw : 출금 기능을 구현하세요.
    // 매개변수: 축급할 금액
    // 반환값은 출금하고 남은 값
    // 출금할 금액이 예정되어 있는 금액보가 크면 출금을 할수 없음.

    public  int withdraw(int money) {
        if (this.money < money){
            System.out.printf("%d원을 출금할수 없습니다.\n", money);
            return this.money;
        }

        this.money -= money;
        System.out.printf("Withdraw: %d원\n", money);
        view();

        return this.money;
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof BankAccount))
            return false;

        BankAccount target = (BankAccount) obj;

        return money == target.money;
    }
}
