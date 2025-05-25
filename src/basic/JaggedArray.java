package basic;

import java.util.Random;

public class JaggedArray {
    public static void main(String[] args) {
        Random rand = new Random();

        // Jagged Array: 불
        int [][] arr = new int[3][];

        String [] strArr = {"hello", "world", "java", "is", "good"};
        for(String str: strArr){
            System.out.printf("%s ", str);
        }

        System.out.println();

        for(String arg : args){
            System.out.printf("%s", arg);
        }


    }
}
