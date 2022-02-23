package ch8_ExceptionHandling.ex13;
/*
* printStackTrace(): 1.예외가 발생한 위치 2.호출 스택에 대한 정보를 알 수 있습니다.
* main 메소드가 method1()을 호출하고 method1()에서 예외가 발생하는 상황
* method1()에서 예외가 발생했고 method1()에서 예외를 처리했다.
* 이렇게 예외가 발생한 메소드 안에서 예외를 처리하면 호출한 메소드는 예외가 발생했다는 사실조차 모르게 된다.
* */
public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }
    static void method1() {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println("method1 메소드에서 예외가 처리되었습니다.");
            e.printStackTrace();    // 호출 스택 정보를 출력합니다.
        }
    }
}
