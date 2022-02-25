package ch7_OOP2.ex12_final;
/*
* final: '마지막의' '변경될 수 없는' 의미를 가집니다.
* final 변수: 값을 한 번 할당하면 변경이 불가능한 상수를 의미합니다.
* final 메소드: 오버라이딩이 불가능합니다.
* final 클래스: 자식클래스를 만들 수 없습니다.
*
* final 인스턴스변수는 생성자에서 초기화를 할 경우에 각 인스턴스마다 final이 붙은 멤버변수가 다른 값을 갖을 수 있습니다.
* 만약 선언과 동시에 초기화를 할 경우에는 모든 인스턴스가 같은 값을 가지는 멤버변수를 가져야 합니다.
* */
class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND = kind;    // 매개변수로 넘겨받은 값으로 KIND와 NUMBER을 초기화 합니다.
        NUMBER = num;
    }

    Card() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        // c.NUMBER = 5;    // final로 지정했기 때문에 값을 변경할 수 없습니다.
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
