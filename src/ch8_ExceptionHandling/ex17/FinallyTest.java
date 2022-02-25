package ch8_ExceptionHandling.ex17;
/*
* finally 블록: 예외가 발생했는지에 상관없이 반드시 실행되어야할 코드를 담고있는 블럭이다.
* 자원을 반환하는 코드 등을 담는다.
* 예외가 발생한 경우 실행 흐름
* try -> catch -> finally
* 예외가 발생하지 않은 경우 실행 흐름
* try --> finally
* */
public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();
        }
    }
    static void startInstall() {
        // 프로그램 설치에 필요한 코드가 담겨있다 가정
    }
    static void copyFiles() {
        // 파일들을 복사하는 코드가 담겨있다 가정
    }
    static void deleteTempFiles() {
        // 임시파일들을 제거하는 코드가 담겨있다 가정
    }
}
