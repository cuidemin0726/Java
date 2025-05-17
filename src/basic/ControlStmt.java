package basic;

import java.util.Scanner;

public class ControlStmt {
    public static void main(String[] args) {
        //if 문
        /* 1형식
         * if (조건식 똑는 논리식) {
         *     조건식 또는 논리식 참인 경우 실행 되는 명령문들....
         *  }
         * 2형식
         *  if (조건식 똑는 논리식) {
         *     조건식 또는 논리식 참인 경우 실행 되는 명령문들....
         *  }else {
         *  조건식 또는 논리식 참인 경우 실행 되는 명령문들....
         * }
         * 3)
         * if(조건식 또는 논리식1){
         *  위 조건식이 참인 경우 실행 되는 명령문들
         * } else if(조건식 또는 논리식2){
         *
         * } else if(조건식 또는 논리식3){
         *
         * }...
         *
         *
         *
         */

        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.print("나이 입력:");
        age = sc.nextInt();

//        if (age > 18) {
//            System.out.println("성인입니다~!");
//        }

        if (age > 18) {
            System.out.println("성인입니다~!");
       }else {
            System.out.println("미성년입니다~!");
        }

        sc.close();


    }
}
