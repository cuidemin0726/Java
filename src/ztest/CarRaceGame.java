import java.util.Random;
import java.util.Scanner;

public class CarRaceGame {

    // 자동차 클래스
    static class Car {
        String name;
        int position;

        public Car(String name) {
            this.name = name;
            this.position = 0;
        }

        // 자동차가 이동하는 함수
        public void move() {
            Random rand = new Random();
            int moveDistance = rand.nextInt(10) + 1; // 1에서 10까지 랜덤 거리
            this.position += moveDistance;
        }

        // 현재 자동차의 상태 출력
        public void printStatus() {
            System.out.println(this.name + " 위치: " + this.position);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 경주 게임에 오신 것을 환영합니다!");

        // 자동차 개수 입력 받기
        System.out.print("경주에 참가할 자동차 수를 입력하세요: ");
        int numCars = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // 자동차 배열 생성
        Car[] cars = new Car[numCars];
        for (int i = 0; i < numCars; i++) {
            System.out.print("자동차 " + (i + 1) + "의 이름을 입력하세요: ");
            String name = scanner.nextLine();
            cars[i] = new Car(name);
        }

        // 목표 지점 설정
        System.out.print("목표 지점을 설정하세요 (예: 100): ");
        int finishLine = scanner.nextInt();

        System.out.println("\n경주가 시작됩니다!");

        // 경주 진행
        boolean raceFinished = false;
        while (!raceFinished) {
            for (Car car : cars) {
                car.move();  // 각 자동차가 이동

                // 각 자동차의 상태 출력
                car.printStatus();

                // 목표 지점에 도달한 자동차가 있는지 체크
                if (car.position >= finishLine) {
                    System.out.println(car.name + "가 경주에서 승리했습니다!");
                    raceFinished = true;
                    break;
                }
            }

            // 잠시 대기 (경주 진행 중)
            try {
                Thread.sleep(500);  // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}