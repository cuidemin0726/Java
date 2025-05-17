package test;

import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {


        int[] lottoMachine = new int[45]; // 로또 볼 45개 설정
        int[] lottoBalls = new int[6]; // 선택된 로또번호 저장할 배열
        int bonusNumber = 0; // 보너스 번호 저장

        //1~45 공을 생성
        for (int i = 0; i < lottoMachine.length; i++) {
            lottoMachine[i] = i + 1;
        }
        int count = 0;

        while (count < 7) {
            //  공을 선택하는 위치(ined)를 랜덤함수로 pick
            int index = (int) (Math.random() * 45);
            // 선택 된 index 의 값이 0이 아니면 아직 미사용 ....0이면 사용된 위치
            if (lottoMachine[index] != 0) {
                if (count < 6) {
                    lottoBalls[count++] = lottoMachine[index];
                } else {
                    bonusNumber = lottoMachine[index];
                    count++;
                }
                lottoMachine[index] = 0; // index 사용 했음 증명!!
            }

        }
        // system  로또 생성 검증
        for (int i = 0; i < lottoBalls.length; i++) {
            System.out.print(lottoBalls[i] + " ");
        }
        System.out.println("보너스번호:" + bonusNumber);

        // 사용자 공 선택!!
        count = 0;
        Scanner scan = new Scanner(System.in);
        int[] userLotto = new int[6];

        while (count < 6) {
            System.out.println((count + 1) + "번째로또번호!: ");
            int balls = scan.nextInt();
            // 중복체크
            for (int i = 0; i < count; i++) {
                if (userLotto[i] == balls) {
                    System.out.println(balls + "는 이미 존해번호!!");
                    balls = 0; // 중복 되었다는 의미
                    break;
                }
            }
            // 0 중복의 의미
            if (balls != 0) {
                userLotto[count++] = balls;
            }
        }
        scan.close(); // scan 닫기

        System.out.println("사용자 로또 번호: ");
        for (int i = 0; i < lottoBalls.length; i++) {
            System.out.print(userLotto[i] + "  ");
        }
        System.out.println();

        int matchCount = 0;
        boolean isBounus = false;


        //비교!!
        for (int i = 0; i < userLotto.length; i++) {
            for (int j = 0; j < lottoBalls.length; j++) {
                if (userLotto[i] == lottoBalls[j]) {
                    matchCount++;
                    break;
                }
            }
            //보너스번호 맞는것 찾기
            if (!isBounus) {
                if (userLotto[i] == bonusNumber) {
                    isBounus = true;
                }
            }

        }
        // 등수 출력
        if (matchCount == 6) {
            System.out.println("1등!!!!!");
        } else if (matchCount == 5 && isBounus) {
            System.out.println("2등!!!!");
        } else if (matchCount == 5) {
            System.out.println("3등!!!");
        } else if (matchCount == 4) {
            System.out.println("4등!!");
        } else if (matchCount == 3) {
            System.out.println("5등!");
        } else {
            System.out.println("낙첨!!");
        }
    }
}
