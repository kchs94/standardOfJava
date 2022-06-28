package 코드스테이츠.람다;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface example;
        example = (x,y) -> {
            int result = x + y;
            return result;
        };

        int result1 = example.accept(6, 4);
        System.out.println("result1 = " + result1);

        example = (x,y) -> {return x + y;};
        int result2 = example.accept(3, 5);
        System.out.println("result2 = " + result2);

        example = (x,y) -> x + y;
        int result3 = example.accept(3, 2);
        System.out.println("result3 = " + result3);

        example = (x,y) -> sum(x,y);
        int result4 = example.accept(3, 5);
        System.out.println("result4 = " + result4);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
