package ch8_ExceptionHandling.ex8;
/*
* printStackTract(): 예외발생 당시의 호출스택(Call Stack)에 있었던 메소드의 정보와 예외 메세지를 화면에 출력합니다.
* getMessage(): 발생한 예외클래스의 인스턴스에 저장된 메세지를 String형으로 반환합니다.
* */
public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // ArithmeticException 발생
            System.out.println(4);
        } catch (ArithmeticException e) {
            e.printStackTrace();    // 참조변수 e를 통해 생성된 ArithmeticException 인스턴스에 접근할 수 있습니다.
            System.out.println("예외메세지: " + e.getMessage());
        }
        System.out.println(6);
    }
}
