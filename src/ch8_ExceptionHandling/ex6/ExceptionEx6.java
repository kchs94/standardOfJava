package ch8_ExceptionHandling.ex6;
/*
*
* */
public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // ArithmeticException 발생
            System.out.println(4);
        } catch (Exception e) { // Exception 클래스는 모든 예외의 부모이므로 모든 예외가 처리된다.
            System.out.println(5);
        }   // try-catch의 끝
        System.out.println(6);
    }   // main 메소드의 끝
}
