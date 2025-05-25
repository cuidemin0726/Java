package test;

import java.util.Arrays;
import java.util.Random;

public class GaggedArray1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int [][] arr = new int[3][];
        for(int i =0; i < arr.length; i++){
            int len = rand.nextInt(10)+1;
            arr[i] =  new int[len];
            for(int j =0; j < arr[i].length; j++){
                arr[i][j] = rand.nextInt(10)+1;
            }
            System.out.println(Arrays.toString( arr[i] ));
        }
        System.out.println();




    }
}

