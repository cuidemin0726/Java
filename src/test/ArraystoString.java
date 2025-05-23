package test;

import java.util.Arrays;

public class ArraystoString {
    public static void main(String[] args) {

        //배열선언
        int[] arr = {5, 7, 1, 4, 11, 9, 10, 2, 4, 3};

        //배열 출력
        System.out.println("정열전: " + Arrays.toString(arr));

        //자동으로 오름차순 정열
        Arrays.sort(arr);
        System.out.println("정열후:" + Arrays.toString(arr));


    }
}
