package 코드스테이츠.스트림;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김코딩", "이자바", "김루비", "김코딩");

        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("김"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("김"))
                .forEach(n -> System.out.println(n));
    }
}
