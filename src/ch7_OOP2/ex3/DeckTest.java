package ch7_OOP2.ex3;
/*
* 참조변수를 출력하면, 참조변수가 가리키고 있는 인스턴스에 toString()을 호출한다.
*
* */
public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

// 덱은 카드를 가지고 있다 O
class Deck {
    final int CARD_NUM = 52;    // 카드의 갯수
    Card cardArr[] = new Card[CARD_NUM];    // Card 객체 배열을 포함합니다.

    Deck() {
        int i=0;

        for (int k=Card.KIND_MAX; k>0; k--) {
            for (int n=0; n<Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int)(Math.random()*CARD_NUM);  // 0~52
        return pick(index);
    }

    void shuffle() {
        for (int i=0; i<cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    static final int KIND_MAX = 4;  // 카드 무늬의 수
    static final int NUM_MAX = 13;  // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";  // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    }
}
