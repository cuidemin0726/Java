package ztest;

import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("넓이를 구할 원의 반지름 : ");
        int ban = scan.nextInt();

        double reult = (ban * ban) * MathCalc.pi;

        MathCalc.print(reult);

        scan.close();

    }
}
