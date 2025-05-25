package basic;

import java.util.Arrays;
import java.util.Random;

public class ArrayExt {
    public static void main(String[] args) {
        // primitive type: byte, char, short, int, long float, double, boolean
        // referenced type: String, Class
        // Wrapper Class
//        Byte a1 = 1;
//        byte a = 1;
        // referenced type: Byte, Character, Short, Integer, Long, Float, Double, Boolean

//        int a = 10;
//        int b = 5;

//        값 바꾸기
//        tmp = a;
//        a= b;
//        b = tmp;


        Integer[] arr = new Integer[10];
//        int [] arr = new int[10];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(45) + 1;
        }


//        for(int n : arr){
//            System.out.printf("%d\t", n);
//        }
            // Arrays.toString(arr): Arrays는 arr 배열을 문자열로 변환함
//        System.out.println(Arrays.toString(arr)); // 디버깅 용도


            // 오름차순 정열
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        // 내림차순 정열
//        Arrays.sort(arr, Comparator.reverseOrder()):// 역순으로 정령
//        System.out.println(Arrays.toString(arr));



        // val을 arr에서 찾아보고 몇번째 인덱스에 있는지 봬열과 해당 인덱스값을
        // [배열....]
        // val : XX 는 index :yy 에 있습니다.

        // 못찾았을때
        //[배열...]
        // val: xx 는 배열에 존재하지 않습니다.
        System.out.println(Arrays.toString(arr));// 배열 전체 출력: 검색 결과 상관없이 출력


        int val = rand.nextInt(45) + 1;

        boolean find = false; // 검색 성공여부 체크하는 플래그
        for(int i = 0; i < arr.length; i++){
            if(val == arr[i]) {
                System.out.printf("val : %d는 인텍스 %d에 있습니다\n", val, i);
                find = true;
                break;
            }
        }
        if (!find){
            System.out.printf("val : %d는 배열에 존재하지 않습니다.\n", val);
        }

//          // 순차 정렬
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[i] ;
//                    arr[i] = arr[j] ;
//                    arr[j] = tmp ;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }

    public static class JaggedArray {
        public static void main(String[] args) {

            //
            Random rand = new Random();

            //Jagged Array : 불규칙적인 가변 길이 배열
            int [][] arr = new int[3][]; // 1차원 배열의 개수가 만들어 지지 않음
            for(int i=0; i< arr.length; i++){
                int len = rand.nextInt(10)+1;
                arr[i] = new int[len];
                for(int j=0; j <arr[i].length; j++){
                    arr[i][j]= rand.nextInt(10)+1;
                }
                System.out.println(Arrays.toString(arr[i]));
            }


        }
    }
}