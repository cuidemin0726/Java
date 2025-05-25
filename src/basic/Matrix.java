package basic;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {

        int[][] arr = new int[2][3]; //2X3: 2차원 배열 표
        arr[0][0] = 1; // 2차원 배열의 첫번째 행의 첫번째열
        arr[0][1] = 2; // 2차원 배열의 첫번째 행의 두번째열
        arr[0][2] = 3; // 2차원 배열의 첫번째 행의 세번째열
        arr[1][0] = 4; // 2차원 배열의 두번째 행의 첫번째열
        arr[1][1] = 5; // 2차원 배열의 두번째 행의 2번째열
        arr[1][2] = 6; // 2차원 배열의 두번째 행의 3번째열
        for(int i = 0; i < arr.length; i++){ // arr.length:2
            for(int j =0;  j < arr[i].length; j++ ){ // arr[i].length:3
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
        }

        // 5X6 2차원 배열을 만들어주세요
        int [][] lotto = new int[5][6];

        // 랜덤 객체 생성
        Random rand = new Random();

        // lotto 배열의 모든칸에 1~45 사이의 값을 입력하세요

        for(int i = 0; i <lotto.length;i++){
            for(int j = 0; j < lotto[i].length; j++){
                lotto[i][j] = rand.nextInt(45)+1;
                //System.out.printf(Arrays.toString(lotto[i][j]));
            }
            // for 문과 Arrays.toSrting() 이용하여 출력
//             System.out.println(Arrays.toString(lotto[i]));
            // 각각의 행을 정열후 출력
            Arrays.sort(lotto[i]);
            System.out.println(Arrays.toString(lotto[i]));
        }
        // 각각의 행을 정열후 출력
        for(int i = 0; i <lotto.length;i++){
            Arrays.sort(lotto[i]);
            System.out.println(Arrays.toString(lotto[i]));

        }
        // 각각의 행을 정열후 출력
        for (int[] ints : lotto) {
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));

        }



//        System.out.println(Arrays.toString(arr));    // arr: 1차원 배열로 봄
//        System.out.println(Arrays.toString(arr[0])); // [1.2,3]
//        System.out.println(Arrays.toString(arr[1])); // [4,5,6]
//
//        int[] nums= {1,2,3};
//        System.out.println(nums);
//        //Arrays.toString(num): nums 라는 배열을 문자열 형식으로 변환
//        String srtarr = Arrays.toString(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(srtarr);
//
////        Random rand = new Random();
////        System.out.println(rand);
//
//
//        int[][][] arr3d = new int[2][3][2]; //3X2: 2차원 배열이 2개 있음

    }
}
