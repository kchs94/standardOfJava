package ch6_oop.연습문제.문제9;
/*
* 모든 객체가 공유하는 변수를 static으로 놓아야 한다.
* 마린의 위치좌표와 체력은 각각의 마린마다 값이 있어야한다. 즉 객체가 독립적으로 가지는 인스턴스 변수이어야 한다.
* 하지만 마린의 공격력과 방어력은 모두 공통적인 값을 가져야한다.. 즉 객체가 공유하는 클래스 변수이어야한다.
* */
public class Marine {
    int x=0, y=0;           // 마린의 위치좌표
    int hp = 60;            // 마린의 체력
    static int weapon = 6;  // 공격력
    static int armor = 0;   // 방어력

    static void weaponUp() {    // 인스턴스 변수에 접근하지 않으므로 클래스 메소드로 처리하였다.
        weapon++;
    }

    static void armorUp() {     // 인스턴스 변수를 사용하지 않으므로 클래스 메소드로 처리하였다.
        armor++;
    }

    void move(int x, int y) {   // 인스턴스 변수를 사용하므로 인스턴스 메소드로 처리하였다.
        this.x = x;
        this.y = y;
    }
}
