package ch6_oop.ex15;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);  // 같은 클래스에 있기 때문에 클래스이름을 사용하지 않아도 메소드 호출 가능

        System.out.println(result);
    }
    // static: 인스턴스를 생성하지 않고 직접 호출
    static int factorial(int n) {
        int result = 0;

        if (n == 1)
            result = 1;
        else
            result = n * factorial(n-1);    // 다시 메소드 자신을 호출한다.

        return result;
    }
}
