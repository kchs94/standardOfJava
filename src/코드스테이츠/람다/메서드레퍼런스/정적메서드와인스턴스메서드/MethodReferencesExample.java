package 코드스테이츠.람다.메서드레퍼런스.정적메서드와인스턴스메서드;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메서드
        operator = Calculator::staticMethod;
        System.out.println("정적메서드 결과 : " + operator.applyAsInt(3, 5));

        // 인스턴스 메서드
        Calculator calculator = new Calculator();
        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메서드 결과 : " + operator.applyAsInt(3, 5));
    }
}
