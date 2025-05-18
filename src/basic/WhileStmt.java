package basic;

import java.util.Scanner;

public class WhileStmt {
    public static void main(String[] args) {
        // 반복문
        // while, do ~ while, for (전통적인 반복문) ==> enhanced for, map.....

        // while(조거식) {
        //  조건식이 참인 동안 반복 실행될 명령문들....
        // }

//        int n = 0;
//        while( n < 10){
//            System.out.println(n++);
//        }
//        System.out.println("while 문 종료됨");
//
//         n = 0;
//         while(true){
//             System.out.println(n++);
//             if ( n > 10) break; // brear 문을 이용하여 현재 반복문을 탈출 가능함.
//         }
//        System.out.println("while 문 종료됨");
//
//         // Scanner 를 이용하여 정수를 입력 받고 , 해당 정수까지 출력
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 입력:");
//        int until = sc.nextInt();
//
//        n = 0;
//        while ( n < until ){
//            System.out.println(n++);
//        }
//        sc.close();

        // 1 부터 10까지의 합을 구하는 코드를 작성.
        // 출력 형식)
        // 1부터 10까지의 합: 55


//        int total = 0; // 누적 변수 초기화
//        n = 1;
//        while( n <= 10) {
//            total = total + n;
//            n++;
//        }
//            System.out.printf("합계:%d\n", total);

        // 사용자가 0을 입력할때까지 숫자를 입력 받고, 해당 숫자를 출력하기
        // 출력 방식
        //숫자를 입력하세요 >>> 1
        // 1
        // 숫자를 입력하세요 >>> 2
        // 2

//        Scanner sc2 = new Scanner(System.in);
//        int n = 0;
//        while(true){
//            System.out.print("숫자를 입력하세요>>>");
//            n = sc2.nextInt();
//            if (n == 0) break; // 사용자가 0을 입력했다면 while 문 즉시 탈출
//            System.out.println(n);
//        }
//        sc2.close();

        //구구단 3단를 코드를 작성
        // 3X1 =3
        // 3X2 =6
        // ...
        // 3X9 = 27

        int n = 1;
        while(n < 10){
            System.out.printf("3 X %d = %d\n", n, 3*n);
            n++;
        }
        System.out.println("while 문 종료됨");


        Scanner sc2 = new Scanner(System.in);





    }
}
