package ch7_OOP2.ex13_AccessModifier;

/*
* 접근 제어자(access modifier)
* 접근 제어자가 사용될 수 있는 곳: 클래스, 멤버변수, 메소드, 생성자
* 1.private: 같은 클래스 안에서만 접근이 가능하다.
* 2.default: 같은 패키지 안에서만 접근이 가능하다.
* 3.protected: 같은 패키지 안에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
* 4.public: 접근 제한이 전혀 없다.
*
* 접근 범위가 넓은 쪽에서 좁은 쪽으로 나열하기
* public < protected < default < private
*
* 접근 제어자를 사용하는 이유
* 1.클래스 안에 선언된 데이터를 보호하기 위해
* 2.클래스 안에서만 사용되는, 내부 작업을 위해 임시로 사용되는 멤버변수나 멤버함수 등을 클래스 내부에 감춰서 복잡성을 낮추기위해.
*
* 멤버변수를 private또는 protected로 제한하고 값을 읽고(getter) 변경(setter-유효성검사포함)할 수 있는 public 메소드를 제공함으로써
* 간접적으로 멤버변수의 값을 다룰 수 있도록 하는 것이 바람직하다.
*
* */
public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
//        t.hour = 13;  // hour의 접근 제어자가 private이므로 클래스 외부에서 접근 불가
        t.setHour(t.getHour() + 1); // 현재 시간보다 1시간 후로 변강한다. 메소드를 통한 간접접근 허용
        System.out.println(t);
    }
}

class Time {
    private int hour;   // private로 선언했으니 클래스 안에서만 접근 가능
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public int getHour() {
        return hour;    // 클래스 안이니깐 접근 가능
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() {
        return minute;  // 클래스 안이므로 직접 참조가능
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() {
        return second;  // 클래스 안에서 접근가능
    }
    public void setSecond(int second) {
        if (second <0 || second > 59) return;
        this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

}