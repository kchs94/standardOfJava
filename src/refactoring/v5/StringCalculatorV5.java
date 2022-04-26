package refactoring.v5;

import java.util.Scanner;

public class StringCalculatorV5 {
    /*
    * 개선된 점: 필요하지 않는 로컬 변수를 제거하였다.
    * 아직 개선해야될 점: 추상화의 수준이 다르다.(compose method 패턴이 필요하다)
    * 추상화란 특징을 뽑는 과정입니다.
    * 특징을 뽑으면 단순해지니 단순화 과정이라고 볼 수 있습니다.
    * text.split은 추상화(단순화)가 되지 않았습니다. 이미 있는 내장함수를 사용했기 때문입니다.
    * text == null과 text.isEmpty() 이미 지원해주는 즉 추상화가 전혀 안된 코드입니다.
    * 반면 지금 sum과 toInt는 따로 합을구하는 것과 형을 변환해준다라는 특징을 뽑은 추상화가 되었으니 위의 2개의 코드도 추상화가 필요합니다.
    * */
    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty()) {   // 추상화 x
            return 0;
        }
        return sum(toInts(text.split(",l:")));  // 추상화 x
    }

    private static int[] toInts(String[] values) {  // 추상화 o
        int[] numbers = new int[values.length];
        for (int i=0; i< values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private static int sum(int[] numbers) { // 추상화 o
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
