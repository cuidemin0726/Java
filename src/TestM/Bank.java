package TestM;

public class Bank {

    private int money;

    // 입금
    public  void setMoney(int money){
        if(money < 0){
            System.out.println("값이 잘못 입력 됨~!!!");
            return; // 일찍종료...
        }
        this.money = money;
    }

    //돈 출력
    public  int getMoney(){
        return money;
    }

}
