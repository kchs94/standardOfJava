package ch7_OOP2.ex4;

/*
* 자바는 상속을 단일 상속만을 허용한다. 다중 상속을 허용하지 않는다.
*
* 다중 상속의 단점은 다음과 같다.
* 1.클래스간의 관계가 복잡하다
* 2.서로 다른 클래스로부터 상속받은 멤버간의 이름이 같은 경우에는 구별할 수 있는 방법이 없다.
*
* 단일 상속의 장점은 다음과 같다.
* 1.클래스간의 관계가 다중 상속에 비해 명확핟.
* 2.코드를 더욱 신뢰할 수 있다.
*
* 만약 두 개의 클래스를 상속해야된다면 하나는 상속하고 다른 하나는 포함관계로 만든다.
* 그리고 자식클래스에 포함관계에 있던 클래스의 멤버 메소드와 일치하는 선언부를 가진 메소드를 선언하고 그 안에서 포함관계에 있는
* 클래스의 메소드를 호출한다.
* */

class TV {
    boolean power;  // 전원상태
    int channel;    // 채널

    void power() { power = !power;}
    void channelUp() { channel++;}
    void channelDown() { channel--;}
}

class VCR {
    boolean power;  // 전원상태
    int counter = 0;

    void power() { power = !power;}
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}

public class TVCR extends TV {
    VCR vcr = new VCR();    // VCR 클래스를 포함시켜서 사용합니다.
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}
