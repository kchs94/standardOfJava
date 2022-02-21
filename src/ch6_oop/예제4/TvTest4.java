package ch6_oop.예제4;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv 객체 배열을

        // Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장하기
        for (int i=0; i<tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;  // tvArr[i]의 channel에 i+10을 저장
        }

        for (int i=0; i<tvArr.length; i++) {
            tvArr[i].channelUp();   // tvArr[i]의 메소드를 호출. 채널이 1증가
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}

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

