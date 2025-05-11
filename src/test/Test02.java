package test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.print("나이 입력: ");
        age = sc.nextInt();

        if(age > 18){
            System.out.println("해당 인원은 어른입니다~!");
        }else {
            System.out.println("해당 인원은 어린이입니다~!");
        }

        sc.close();

    }
}
