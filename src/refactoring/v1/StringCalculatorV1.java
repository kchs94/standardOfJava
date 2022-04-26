package refactoring.v1;

import java.util.Scanner;

public class StringCalculatorV1 {
    /*
    * - 문제점:들여쓰기가 너무 많다.
    * - 한 메소드에 오직 한 단계의 들여쓰기(indent)를 한다.
    * */
    public static int splitAndSum(String text) {
        int result = 0;
        if (text == null || text.isEmpty()) {
            result = 0;
        } else {
            String[] values = text.split(",l:");
            for (String value : values) {
                result += Integer.parseInt(value);  // 들여쓰기가 깊이가 2인곳
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

    }
}
