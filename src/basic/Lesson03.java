import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        // 입력문

        // 콘솔 입력 객체를 생성 함
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요>>>");
        int age = sc.nextInt();     // 콘솔로부터 정수 입력 받음

        sc.nextLine();
        System.out.print("이름을 입력하세요>>>");
        String str = sc.nextLine(); //콘솔로부터 문자열 입력 받음

        System.out.print("키를 입력하세요>>>");
        float h = sc.nextFloat();

        System.out.printf("%s 님의 나이는 %d 살입니다, \n", str, age);
        System.out.printf("키는 %.2fcm입니다, \n", h);// %.2f > 소수점 아래 2자리까지만 표시

        sc.close(); // (중요!) 스캐너 객체를 생성한 뒤에는 무조건 닫아주어야 함

    }

}
