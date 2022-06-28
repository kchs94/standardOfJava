package 코드스테이츠.람다.메서드레퍼런스.정적메서드와인스턴스메서드참조;

public class Calculator {

    public static int staticMethod(int x, int y) {
        return x + y;
    }

    public int instanceMethod(int x, int y) {
        return x * y;
    }
}
