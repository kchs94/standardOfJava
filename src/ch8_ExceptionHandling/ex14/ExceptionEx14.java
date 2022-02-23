package ch8_ExceptionHandling.ex14;
/*
* main 메소드가 method1()을 호출하고 method1()에서 예외가 발생하는 상황
* 호출한 main 메소드가 method1()에서 발생한 예외를 처리하는 코드
* */
public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception e) {
            System.out.println("main 메소드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception {
        throw new Exception();
    }
}
