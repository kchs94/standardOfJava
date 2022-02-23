package ch8_ExceptionHandling.ex22;
/*
* 예외 되던지기
* 단 하나의 예외를 예외가 발생한 메소드와 호출한 메소드 양쪽에서 처리할 수도 있다.
* 예외가 발생한 메소드에서 예외를 처리한 후에 catch 문에서 다시 예외를 발생시키는 방법을 통해 가능한데 이것을 예외 되던지기라고한다.
* */
public class ExceptionEx22 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메소드에서 예외가 처리되었습니다.");
        }
    }
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메소드에서 예외가 처리되었습니다.");
            throw e;    // 다시 예외를 발생시킵니다.
        }
    }
}
