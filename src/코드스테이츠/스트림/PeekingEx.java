package 코드스테이츠.스트림;

import java.util.Arrays;
import java.util.List;
/*
* - 연산 결과 확인(peek())
* - forEach()와 요소를 하나씩 돌면서 출력한다는 기능에서 동일하지만, 동작 방식은 다르다.
* - peek은 중간 연산자, forEach는 최종 연산자 메서드
* - 따라서,peek은 여러번 호출가능, forEach는 스트림의 요소를 소모하므로 한 번만 호출 가능
* */
public class PeekingEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,6,2,9,7);

        int sum = list.stream()
                .mapToInt(i -> i)
                .filter(integer -> integer % 2 == 0)
                .peek(result -> System.out.println(result))
                .sum();

        System.out.println(sum);
    }
}
