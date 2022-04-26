package refactoring.v3;

import java.util.Scanner;

public class StringCalculatorV3 {
    /*
    * 개선된 점: else 사용하지 않기
    * 아직 개선해야될 점:메소드가 2가지 이상의 일을 하고 있다.
    * sum 메소드는 1.합을 구할뿐 아니라 2.형변환(문자열 --> 숫자로 변환,파싱)도 하고 있다.
    * */
    public static int splitAndSum(String text) {
        int result = 0;
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] values = text.split(",l:");
        return result = sum(values);   // 들여쓰기 깊이 1
    }

    private static int sum(String[] values) {
        int result = 0;
        for (String value : values) {
            result += Integer.parseInt(value);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

    }
}
