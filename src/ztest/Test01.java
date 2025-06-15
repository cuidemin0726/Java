package ztest;

public class Test01 {
    public static void main(String[] args) {
        int num1 = 500;
        int num2 = 200;
        int num3 = 0;
        float f1 = 3.0F;
        float f2 = 0.F;

        num3 = num1 + num2;
        System.out.printf("%d + %d = %d\n",num1, num2, num3);

        num3 = num1 / num2;
        System.out.printf("%d / %d = %d\n",num1, num2, num3);

        num3 = num1 % num2;
        System.out.printf("%d %% %d = %d\n",num1, num2, num3);

        f2 = num1 % f1;
        System.out.printf("%d %% %f = %f\n",num1, f1, f2);

        f2 = num1 / f1;
        System.out.printf("%d / %f = %f\n",num1, f1, f2);


    }
}
