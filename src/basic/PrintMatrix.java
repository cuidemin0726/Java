package basic;

public class PrintMatrix {
    public static void main(String[] args) {
        // printmatrix 문

        for(int i=0; i < 101; i++ ) {
            int ten = i/10;
            int il = i % 10;

            if(i%3==0)
                System.out.print("짝\t");
            else
                System.out.printf("%d\t", i);

            if(i%10==0) { // 10 단위 체크
                System.out.println();
            }
        }

    }
}
