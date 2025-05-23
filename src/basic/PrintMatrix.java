package basic;

public class PrintMatrix {
    public static void main(String[] args) {
        // printmatrix 문

//        for(int i=0; i < 101; i++ ) {
//            int ten = i/10;
//            int il = i % 10;
//
//            if(i%3==0)
//                System.out.print("짝\t");
//            else
//                System.out.printf("%d\t", i);
//
//            if(i%10==0) { // 10 단위 체크
//                System.out.println();
//            }
//        }
//
//    }
//============================================================

        for(int i = 0; i <= 100; i++ ) {
            int ten = i / 10;
            int il = i % 10;


            if(ten == 3 || ten == 6 || ten == 9) {
                ten++;
                System.out.print("짝\t");
            }

            if(il == 3 || il == 6 || il == 9) {
                il++;
                System.out.print("짝\t");
            }

            if(i % 3==0) {
                System.out.print("짝\t");
            }else
                System.out.printf("%d\t", i);

            if(i % 10 == 0) { // 10 단위 체크
                System.out.println();
            }
        }

    }
}
