package refactoring.v4;

import java.util.Scanner;

public class StringCalculatorV4 {
    /*
    * 개선된 점: 메소드는 한 가지일만 한다.
    * 아직 개선해야될 점: 로컬 변수가 꼭 필요한가?
    * result, values 그리고 numbers가 꼭 필요할까?
    * */
    public static int splitAndSum(String text) {
        int result = 0;
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] values = text.split(",l:");
        int[] numbers = toInts(values);
        return result = sum(numbers);   // 들여쓰기 깊이 1
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
