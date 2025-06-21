package thread;

import java.util.Scanner;

public class ThreadTest {
    public static void exceptionTest(){

        // 예외(Exception) 처리
        int [] arr = {1,2,3};

//        System.out.println(arr[3]);
        //...
        Scanner sc = new Scanner(System.in);

        // try와 catch 세트로서 무조건 있어야 함
        // finally 옵션 사항, 필요 시 추가하면 됨
        try {

            System.out.println("정수를 입력하세요 : ");
            int number = sc.nextInt();
            System.out.println("입력된 값: " + number);

            System.out.println(10/0); // 잘못해서 분모에 0이 들어가도록 실수함....
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());// ArrayIndexOutOfBoundsException 의 기본 메시지 출력
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌수 없음~!");// 개발자 커스텀 메시지를 출력
        } catch (Exception e){
            System.out.println("알수 없는 에러 발생함~!");// Exception 최상위 클래스, 개발자 커스텀 메시지를 출력
        } finally {
            // try 를 진입하면 무조건 마지막에 실행 되는 블록
            sc.close();
        }
    }

    public static void main(String[] args) {
//        exceptionTest();

        MyThread th1 = new MyThread("서브 스레드1");
        MyThread th2 = new MyThread("서브 스레드2");

        //Runnable intterface를 구현한 클래스를 인스턴스로 생성함
        //MyRunThread rt = new MyRunThread("서브 스레드3"); // runnable 스레드
        Thread th3 = new Thread(new MyRunThread("서브 스레드3"));
        Thread th4 = new Thread(new Runnable() {
            private final String name = "서브 스레드4";
            @Override
            public void run() {
                for(int i = 0; i < 20; i++){
                    System.out.printf("[%s] : %d\n", name, i);

                    try {
                        Thread.sleep(1); // 1초 쉬어라~!
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        Thread th5 = new Thread(() -> {
            for(int i = 0; i < 20; i++){
                System.out.printf("[%s] : %d\n", "서브 스레도5", i);

                try {
                    Thread.sleep(100); // 1초 쉬어라~!
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        
        th1.start(); // Thread를 시작시키는 메소드 ==> run() 메소드가 자동으로 실행됨
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        for(int i = 0; i < 20; i++) {
            System.out.printf("[메인스레드] : %d\n", i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        try {
            th1.join(); // 스레드 종료 될때까지 대기 함
            th2.join();
            th3.join();
            th4.join();
            th5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("프로그램 정상 종료됨");


    }
}
