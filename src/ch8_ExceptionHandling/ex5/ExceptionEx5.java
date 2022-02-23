package ch8_ExceptionHandling.ex5;
/*
* 예외의 발생과 catch 블럭
* - 예외가 발생하면, 해당 예외에 해당하는 클래스의 인스턴스 생성됩니다.
* - catch 블록을 차례로 탐색하면서 발생한 예외 인스턴스와 괄호내 참조변수의 타입과 instanceof 연산을 합니다.
* - 결과가 true이면 해당 블록으로 프로그램 흐름이 진행됩니다.
*
* 모든 예외 클래스는 Exception 클래스의 자손입니다. 따라서 catch 블럭 괄호안에 Exception 클래스 타입의 참조변수를 선언하면
* 어떤 예외가 발생하더라도 이 catch 블럭에서 예외가 처리됩니다.
*
* */
public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);  // 바로 위 문장에서 예외가 발생했기 때문에 이 문장이 실행되지 않고 곧바로 catch 블록으로 흐름이 진행된다.
        } catch (ArithmeticException e) {
            System.out.println(5);
        }   // try-catch의 끝
        System.out.println(6);
    }   // main 메소드의 끝
}
