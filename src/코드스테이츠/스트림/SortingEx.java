package 코드스테이츠.스트림;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

        list.stream()
                .sorted()
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));
    }
}
