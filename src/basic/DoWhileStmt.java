package basic;

import java.util.Scanner;

public class DoWhileStmt {
    public static void main(String[] args) {
        // do ~ while 문
//        do{
//
//        }while(조선식);

        Scanner sc = new Scanner(System.in);
        int dan = 1;

        do {
                System.out.println("단수 입력: ");
                dan = sc.nextInt();
                if (dan == 0) break;

                int n = 1;
                while(n < 10) {
                    System.out.printf("%d X %d =%d\n", dan, n, dan * n);
                    n++;


            }
        } while (true);

        sc.close();

        System.out.println("반복문 종료됨!!!");
    }
}
