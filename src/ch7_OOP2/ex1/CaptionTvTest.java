package ch7_OOP2.ex1;
/*
* 상속(inheritance): 기존 클래스를 재사용해서 새로운 클래스를 작성하는 것.
* - 자손 클래스는 부모 클래스의 모든 멤버를 상속받는다.
* - 생성자와 초기화 블록은 상속받지 않는다.
* - 자손 클래스의 멤버 갯수 >= 조상 클래스의 멤버 갯수
*
* 장점
* 1.코드의 재사용
* 2.코드량 감소
* 을 통해 생산성 향상과 유지보수가 쉬워진다.
*
* 조상 클래스: 부모클래스(parent), 상위클래스(superclass), 기반클래스(baseClass)
* 자손 클래스: 자식클래스(chileClass), 하위클래스(subClass), 파생된클래스(derived)
*
* */
class Tv {
    boolean power;  // 전원상태
    int channel;    // 채널

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}

class CaptionTv extends Tv {
    boolean caption;    // 캡션 상태
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World");
    }
}
