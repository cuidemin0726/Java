package basic;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);

        }

        // 오름차순 정열
        Arrays.sort(arr);

        // *버블 정령을 알고리즘을 이용하여 배열를 정령하세요~!(숙제)*
//        for (int i = arr.length -1; i >= 0 ; i--) {
//                int j =
//        }

        // 배열 출력
        System.out.println(Arrays.toString(arr));

        int val = rand.nextInt(1000); // 찾을 값을 랜덤으로 설정

        // 이진 탐색(Binary Search)
        int start = 0; // 배열의 시삭 인덱스
        int end = arr.length - 1; // 배열의 마지막 인덱스

        int count = 0;

        boolean flag = false;
        while (start <= end) {
            count++;
            int mid = (end - start) / 2 + start; // 현재 배열의 가운데 인덱스
            if (arr[mid] == val) {
                // Val 을 찾은 경우
                System.out.printf("%d는 배열의 %d 인덱슽에 있습니다\n", val, mid);
                System.out.printf("%d번째안에 값을 찾았습니다.\n", count);
                flag = true;
                break;
            }

            if (arr[mid] > val)
                end = mid - 1;
            else
                start = mid + 1;
        }

        if (!flag) {
            System.out.printf("%d 번 반복 수행함\n", count);
             System.out.printf("%d를 배열에서 찾지 못했습니다.\n", val);
            }
    }
}
