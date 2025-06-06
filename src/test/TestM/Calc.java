package test.TestM;

public class Calc {

    public static int sumArray(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return  sum;
    }

    public static void printResult(int result){
        System.out.println("결과 : " + result);
    }
}
