package ch7_OOP2.연습문제.ex14;
/*
* - 원래 변수 앞에 fianl을 붙일 때는 선언과 동시에 초기화를 해줘야 한다.
* 그러나, 인스턴스 변수의 경우 생성자를 통해서도 초기화를 할 수 있다.
* */
public class ex7_14 {
    public static void main(String[] args) {

        SutdaCard card = new SutdaCard(1, true);
    }
}

class SutdaCard {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard() {
        this(1, true);
    }

    // 생성자 안에서 상수를 초기화 한다.
    SutdaCard(int NUM, boolean IS_KWANG) {
        this.NUM = NUM;
        this.IS_KWANG = IS_KWANG;
    }

    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    }
}