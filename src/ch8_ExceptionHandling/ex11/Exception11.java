package ch8_ExceptionHandling.ex11;
/*
* RuntimeException들에 해당하는 예외들은 프로그래머 실수로 발생하는 예외이므로 예외처리를 강제하지 않습니다.
* */
public class Exception11 {
    public static void main(String[] args) {
        throw new RuntimeException();   // RuntimeException을 고의로 발생시킵니다.
    }
}
