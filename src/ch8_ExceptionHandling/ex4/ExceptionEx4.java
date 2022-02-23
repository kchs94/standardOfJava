package ch8_ExceptionHandling.ex4;
/*
* try-catch문에서의 흐름
* - try 블럭 내에서 예외가 발생했을 때
* 1.발생한 예외와 일치하는 catch 블럭이 있는지 순차적으로 확인한다.
* 2.일치하는 블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장들을 계속해서 수행합니다.
* 주의: 예외가 발생한 위치 이후의 try블럭 문장들은 수행되지 않습니다.
* 만약 일치하는 catch 블럭이 없으면 예외는 처리되지 못합니다.
* - try 블럭 내에서 예외가 발생하지 않았을 때
* 1.catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속합니다.
* */
public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);  // 예외가 발생하지 않았으므로 이 문장은 실행되지 않습니다.
        }   // try-catch의 끝
        System.out.println(6);
    }   // main 메소드의 끝
}
