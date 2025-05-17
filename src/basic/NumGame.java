package basic;

import java.util.Random;
import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10)+1;
        System.out.println(n);

        Scanner sc = new Scanner(System.in);

//        int num = 0;
        while (true) {
            System.out.printf("숫자를 입력하세요 >>> ");
            int num = sc.nextInt();
            if ( num == n) break;

            if(num > n)
                System.out.println("UP");
            else
                System.out.println("DOWN");

        }
        System.out.println("정답~~~!");
        sc.close();
    }
}