package refactoring.v6;

import java.util.Scanner;

public class StringCalculatorV6 {
    /*
    * 개선된 점: 추상화의 수준이 같아졌다.
    * */
    public static int splitAndSum(String text) {
        if (isBlank(text)) {
            return 0;
        }
        return sum(toInts(split(text)));
    }

    private static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private static String[] split(String text) {
        return text.split(",l:");
    }

    private static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i=0; i< values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
    }
}
