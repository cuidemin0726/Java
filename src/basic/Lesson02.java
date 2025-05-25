package basic;

public class Lesson02 {
    public static void main(String[] args) {
        // Primitive Data type, 정수와 실수
        //정수형
        char ch = 'a'; //문자형 2byte
        short n1 = 10; //2byte
        int i = 100; // 4byte
        long age = 200L; //8byte, 뒤에 L 붙여 long type 표시
        boolean isOK = true ; //16byte true or false

        //실수형
        float pi = 3.14F; //4byte, float 형 데이터 경우 뒤에 F 추가하여 표시
        double ma = 1.0;//8byte

        System.out.println("ch 변수의 값: " + ch);
        System.out.println("n1 변수의 값: " + n1);
        System.out.println("i 변수의 값: " + i);
        System.out.println("age 변수의 값: " + age);

        System.out.printf("ch 변수의 값: %c\n", ch); //%c: 문자 1개 출력 방식
        System.out.printf("n1 변수의 값: %d\n", n1); //%d: 정수 출력
        System.out.printf("age 변수의 값: %d\n", age); // %d:  정수 출력
        System.out.printf("ma 변수의 값: %f\n", ma); // %f: 실수 출력



        // Referenced Data Type
        String str = "abc"; //문자열 데이터, 일반적 선언

        String name = new String("최덕민"); // 모두 이런 형식으로 사용함

        System.out.println(str);
        System.out.printf("str 변수의 값: %s\n", str); // %s: 문자열 출력
        // .... 수십만개 있음....
        // 변수명 만들때 키워드 피해야 되고 특수문자 _ 사용할수 있음, 대소문자 구분 필요
        // 변수를 선언 후 사용 가능






    }

    public static class ArrayCopy {
        public static void main(String[] args) {
            int[] cards = {1,6,9,8,2,7};
            int[] newCards = new int[6];

            // 복사 메서드를 이용하여 깊은 복사 진행
            System.arraycopy(cards, 0, newCards, 0, newCards.length);

            cards[1] = 11;
            newCards[3] = 20;

            System.out.println("card: ");
            for(int i = 0; i < cards.length; i++){
                System.out.print(cards[i] +"\t");
            }
            System.out.println();

            System.out.println("newCards : ");
            for(int i = 0; i < newCards.length; i++){
                System.out.print(newCards[i] + "\t");
            }

        }
    }
}
