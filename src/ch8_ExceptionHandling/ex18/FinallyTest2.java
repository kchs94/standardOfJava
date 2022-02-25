package ch8_ExceptionHandling.ex18;
/*
* fianlly 블록에는 예외발생 여부와 상관없이 실행되어야하는 코드를 담습니다.
* EX) 자원 반환.
* */
public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();  // 예외 발생 여부와 상관없이 무조건 실행되어야하는 코드
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
