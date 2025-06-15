package ztest;

public class PrintMt {
    public static void main(String[] args) {
        // printmatrix 문

        for(int i = 0; i <= 100; i++ ) {
            int ten = i/10; // 십의 자리 체크
            int il = i % 10; // 일의 자리 체크
            int count = 0; // 카운트 체크

            if (ten == 3 || ten == 6 || ten == 9) {
                count++;
            }

            if (il == 3 || il == 6 || il == 9) {
                count++;
            }

           if(count > 0){
               for(int j = 0; j < count; j++){
                   System.out.print("짝");
               }
               System.out.print("\t");
           } else{
               System.out.printf("%d\t", i);
           }


            if(i % 10 == 0) { // 10 단위 체크
                System.out.println();
            }
        }

    }
}

