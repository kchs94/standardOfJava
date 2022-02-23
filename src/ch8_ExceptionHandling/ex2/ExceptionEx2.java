package ch8_ExceptionHandling.ex2;
/*
* 결과에 나타난 메세지를 보면 예외의 1.발생원인 2.발생위치를 알 수 있습니다.
* */
public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i=0; i<10; i++) {
            result = number / (int) (Math.random() * 10);   // 9번째 라인
            System.out.println(result);
        }
    }
}
