package basic;

import java.util.Scanner;

public class ArrayJava {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }

        System.out.print("배열의 개수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        // 데이터 타입 [] 배열명 = new 데이터타입[배열의 아이템 개수]; 칸을 먼저 만들고 데이타 기입
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) { // 배열의 길이 : 배열명.length (배열의 길이를 알수 있음)
            arr[i] = (i + 1) * 10;
            System.out.printf("%d\t", arr[i]);
        }
        sc.close();

        System.out.println();

        //arr 10칸짜리 배열을 만들고, 각 아이템에 2 부터 짝수가 입력 되도록 코드를 작성 해주세요
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1) * 2;
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();

        // arr 배열에서 0번쨰 인덱스의 아이템부터 짝수 인덱스테 해당 하는 값만 입력(전통적인 방법)
        for (int i = 0; i < arr.length; i+=2) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();

        // 값을 줘야하는 경우에만 사용함
        for(int n : arr){
            System.out.printf("%d\t", n);
        }
        System.out.println();
    }
}