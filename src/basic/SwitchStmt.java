package basic;

import java.util.Random;

public class SwitchStmt {
    public static void main(String[] args) {

        Random rand = new Random(42); // 난수값을 생성하는 클래스
        int num = rand.nextInt(10);

        // 인스턴스를 생성하는 방법
        // 클래스명 객체명 = new 생성자();
        // Scanner sc = new Scanner(System.in);

//        if(num ==1){
//
//        }else (num ==2){
//
//        }else (num ==3 ){
//
//        }


        switch (num)
        {
            case 1:
                System.out.println(("값1"));
                break; // 현재 블록을 탈출 시킴

            case 2:
                System.out.println(("값2"));
                break; // 현재 블록을 탈출 시킴

            case 3:
                System.out.println(("값3"));
                break; // 현재 블록을 탈출 시킴

            case 4:
            case 5:
            case 6:
                System.out.println("값 3 보다 큼");
                break;

            default:
                System.out.println("num 해당 값 없음");
        }   //Switch
    }
}
