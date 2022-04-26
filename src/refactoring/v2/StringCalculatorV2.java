package refactoring.v2;

import java.util.Scanner;

public class StringCalculatorV2 {
    /*
    * 개선된 점: 들여쓰기 리팩토링
    * 아직 개선해야될 점: else를 사용하지 않는다.
     * return을 사용하면 else 사용량을 줄일 수 있다.
    * */
    public static int splitAndSum(String text) {
        int result = 0;
        if (text == null || text.isEmpty()) {
            result = 0;
        } else {
            String[] values = text.split(",l:");
            result = sum(values);   // 들여쓰기 깊이 1
        }
        return result;
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
