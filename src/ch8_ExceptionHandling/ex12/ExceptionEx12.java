package ch8_ExceptionHandling.ex12;
/*
* 메소드 throws 예외: 발생한 예외에 대한 처리 책임을 자신을 호출한 메소드에 전가한다. 결국 어느 한곳에서는 반드시
* try - catch문으로 예외 처리를 해주어야 한다.
*
* */
public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception {
        throw new Exception();
    }
}
