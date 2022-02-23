package ch8_ExceptionHandling.ex9;
/*
* 예외 발생시키기
* 1.먼저, 연산자 new를 사용해서 발생시키려는 예외 클래스의 객체를 생성합니다.
* Exception e = new Exceptionn("일부로 발생시켰음");
* 2.키워드 throw를 사용해서 예외를 발생시킵니다.
* throw e;
* */
public class Exception9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");   // 생성자에 String 인자를 넣어주면 이 String이 메세지로 저장된다.
            throw e;
//            throw new Exception("고의로 발생시켰음");
        } catch (Exception e) {
            System.out.println("에러 메세지:" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었습니다.");
    }
}
