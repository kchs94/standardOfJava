package ch7_OOP2.ex36_InnerEx6;
/*
* 익명 클래스(anonymous class)
* - 클래스명이 없는 클래스
* - 클래스 선언과 객체 생성을 동시에 한다
* - 일회용 클래스다
* - 오직 단 하나의 객체만 생성한다.
* - 오로지 단 하나의 클래스만 상속받거나 단 하나의 인터페이스만을 구현한다.
* */
public class InnerEx6 {
    // 익명 클래스
    Object iv = new Object() {
        void method(){}
    };

    // 익명 클래스
    static Object cv = new Object(){
        void method(){}
    };

    void myMethod() {
        // 익명 클래스
        Object lv = new Object() {
            void method() {}
        };
    }
}
