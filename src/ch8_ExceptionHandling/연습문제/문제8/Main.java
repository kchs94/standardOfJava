package ch8_ExceptionHandling.연습문제.문제8;

import java.util.Scanner;

class Valid extends RuntimeException {
}

public class Main {
    public static void main(String[] args) {
        // 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random()*100) + 1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.println("1과 100사이 값을 입력하세요 :");

            try {   // 입력받는 부분에 예외처리를 해주면 된다.
                input = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("유효하지 않은 값을 입력했습니다. 다시 값을 입력해주세요.");
                continue;
            }

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 " + count + "번 입니다.");
                break;
            }
        } while (true);
    }
}
