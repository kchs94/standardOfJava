package ch6_oop.연습문제.문제8;
/*
* 클래스 변수(static 변수): width, height
*   클래스 변수는 클래스 영역에 선언되있고 static이 붙은 변수
*   클래스 변수는 클래스가 메모리에 올라갈 때 생성된다.
* 인스턴스 변수: kind, num
*   인스턴스 변수는 클래스 영역에 선언되어있고 static이 붙지 않은 변수
*   인스턴스 변수는 인스턴스가 생성되었을 때 생성된다.
* 지역변수: k, n, args[], card
*   지역변수는 클래스 영역이외 영억에 선언된 변수이다.
*   지역변수는 변수 선언문이 수행되었을 때 생성된다.
* */
public class PlayingCard {
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n) {
        kind = k;
        num = n;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1, 1);
    }
}
