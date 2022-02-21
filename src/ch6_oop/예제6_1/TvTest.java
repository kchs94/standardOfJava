package ch6_oop.예제6_1;

class Tv {
    // Tv의 속성(=멤버변수, 필드, 상태, 특성)
    String color;   // 색상
    boolean power;  // 전원
    int channel;    // 채널

    // Tv의 기능(메소드)
    void power()    { power = !power;}  // TV를 켜거나 끄는 기능을 하는 메소드
    void channelUp() { ++channel;}  // TV 채널을 올리는 기능을 하는 메소드
    void channelDown() {--channel;} // TV 채널을 내리는 기능을 하는 메소드
}

public class TvTest {
    public static void main(String[] args) {
        Tv t;               // Tv 인스턴스를 참조하기 위한 참조변수 t를 선언
        t = new Tv();       // Tv 인스턴스를 생성
        t.channel = 7;      // Tv 인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown();    // Tv 인스턴스의 메소드 channelDown을 호출한다.
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}
