package ch8_ExceptionHandling.ex3;
/*
* try-catch문을 사용해서 예외를 발견하고 처리합니다.
* try에 예외가 발생할 수 있는 문장을 넣습니다.
* 예외가 발생하면 해당 예외클래스의 인스턴스가 생성됩니다.
* 이제 이 예외를 처리할 수 있는 catch 블럭이 있는지 순차적으로 찾습니다.
* 괄호에 선언된 참조변수의 종류와 예외클래스의 인스턴스를 instanceof연산자를 이용해서 검사합니다.
* true이면 해당 catch 블록안 문장들이 실행되고 다른 catch블럭은 실행되지 않습니다.
* */
public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i=0; i<10; i++) {
            try {
                result = number / (int) (Math.random() * 10);   // 9번째 라인
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");    // ArithmeticException이 발생하면 실행되는 코드
            }   // try-catch의 끝
        }   // for의 끝
    }
}
