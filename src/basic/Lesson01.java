public class Lesson01 {
    public static void main(String[] args) {
        int age = 20;

        System.out.println("안녕하세요" + "Java입니다." + age); //가장 기본적인 출력 메소드, //라인단위 출력


        System.out.printf("나이는 %d 살입나다\n", age); // 형식을 갖는 출력 메소드, + 기능 미지원
        System.out.println("나이는" + age + "살입니다!");

        System.out.print("Hello Java World!!\n"); // 제일 기본적인 출력문임
        System.out.print("Hello Java World!!");

        // name 이라는 문자열 변수를 선언하고 "최덕민"이라는 값을 대입한다.
        String name = "최덕민";
        System.out.printf("안녕하세요. 제이름은 %s이고, 나이는 %d살 입니다\n", name, age); // % 붙어 있는 항목들 형식 문자임
        System.out.println("안녕하세요. 제이름은" + name + "이고, 나이는 " +age+"살 입니다");

    }
}