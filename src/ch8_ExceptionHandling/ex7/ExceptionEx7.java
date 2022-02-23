package ch8_ExceptionHandling.ex7;
/*
* 마지막에 Exception 클래스 타입의 참조변수를 선언한 catch 블록을 사용하면
* 어떤 종류의 예외가 발생하더라도 이 catch 블럭에 의해 예외를 처리할 수 있습니다.
* */
public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // ArithmeticException 발생
            System.out.println(4);
        } catch (ArithmeticException e) {
            if (e instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) { // 위 catch 블록에서 예외가 처리되었기 때문에 나머지 catch 블록은 수행되지 않습니다.
            System.out.println(5);
        }
        System.out.println(6);
    }
}
