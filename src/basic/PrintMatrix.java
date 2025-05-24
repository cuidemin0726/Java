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
            String str = " ";


            if(ten % 3==0 && ten != 0)
                str = "작";

            if(il % 3==0 && il != 0)
                str += "작";

            if(str.isEmpty()) // str이 빈 문자열이면 true를 반한함
                System.out.printf("%d\t", i);

            else
                System.out.printf("%s\t", str);

            if(i % 10 == 0) { // 10 단위 체크
                System.out.println();
            }
        }

    }
}
