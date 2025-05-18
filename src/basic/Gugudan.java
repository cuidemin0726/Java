package basic;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        // 사용자에게 단수를 입력 받아서 해당 산수 구구단를 출력하는 코드르 작성세요!
//        Scanner sc = new Scanner(System.in);
//        int dan = sc.nextInt();
//        int n = 1;
//
//        while (n < 10) {
//            System.out.printf("%d X %d = %d\n", dan, n, dan * n);
//            n++;
//        }
//        sc.close();
        // 사용자가 0을 입력할때까지 사용자로부터 단수를 입력 받아서
        // 해당 단수를 출력하는 구구단 코드를 작성핫세요
        // 단수를 입력하세요 >>> 3
        // 3X1 = 3
        // 3X2 = 6
        //...
        // 3X9 =27
        // 단수를 입력하세요 >>> 5
        // 5X1=5
        // 5X2=10
        //...
        // 단수를 입력하세요 >>> 0
        // 프로그램 종료 출력됨
        Scanner sc = new Scanner(System.in);
        int dan = 1;

        while (true) {
            System.out.println("단수 입력: ");
            dan = sc.nextInt();
            if(dan == 0) break;

            int n =1;
            while (n < 10) {
                System.out.printf("%d X %d =%d\n", dan, n, dan*n);
                n++;
            }
        }

        sc.close();

    }
}
