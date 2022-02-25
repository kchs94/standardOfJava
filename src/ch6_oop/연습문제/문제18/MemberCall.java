package ch6_oop.연습문제.문제18;

public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;    // static 구역에 인스턴스 변수를 참조할 수 없다.

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); // static 메소드에 인스턴스를 생성하지 않으면 인스턴스 변수를 참조할 수 없다.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();  // static 메소드에서 인스턴스를 생성하지 않으면 인스턴스 메소드를 호출할 수 없다.
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
