package ch8_ExceptionHandling.ex19;

public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println("method1() 수행을 마치고 main 메소드로 돌아왔습니다.");
    }
    static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            return; // return 문이 있어도 fianlly 블록이 먼저 실행되고 return 문이 실행된다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally 블록이 실행되었습니다.");
        }
    }
}
