package ch6_oop.연습문제.문제24;

public class Exercise6_24 {
    public static int abs(int value) {
        return value>=0 ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절댓값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절댓값:" + abs(value));
    }
}
