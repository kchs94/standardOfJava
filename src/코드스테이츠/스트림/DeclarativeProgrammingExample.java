package 코드스테이츠.스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeclarativeProgrammingExample {
    public static void main(String[] args) {

        // List 요소 중 4보다 큰 짝수의 합계 구하기
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,6,7,8,11));

        int sum = list.stream()
                .filter(number -> number > 4 && (number % 2 == 0))
                .mapToInt(number -> number)
                .sum();

        System.out.println("sum = " + sum);
    }
}
