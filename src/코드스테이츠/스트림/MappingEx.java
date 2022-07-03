package 코드스테이츠.스트림;

import java.util.Arrays;
import java.util.List;

/*
* 매핑
* - 기존의 Stream 요소들을 대체하는 새로운 Stream을 만드는 중간 연산
* - 저장된 값을 특정 형태로 변환해야할 때 사용한다.
* - 매개변수로 함수형 인터페이서 Function을 받는다.
* - String을 요소로 갖는 Stream을 모두 대문자 String의 요소들로 변환하고자 할 때 사용한다.
* - mapOOO 작업을 하면 때때로 Stream 객체 <-> 원시 Stream 으로 변환하는 작업이 필요하다
* - 그래서 mapToInt(), mapToLong(),.. mapToObject()가 있다.
*
* */
public class MappingEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "tomato", "watermelon");

        list.stream()
                .map(e -> e.toUpperCase())
                .forEach(e -> System.out.println(e));
    }
}
