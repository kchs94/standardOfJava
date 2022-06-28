package 코드스테이츠.람다.메서드레퍼런스.생성자참조;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructReferenceExample {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("kimcoding");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("kimcoding", "김코딩");
    }
}
