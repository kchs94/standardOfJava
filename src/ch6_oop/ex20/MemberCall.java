package ch6_oop.ex20;

/*
* 클래스 멤버와 인스턴스 멤버간의 참조와 호출
* 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만,
* 클래스 멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수도 있다.
* 따라서 클래스 변수나 메소드에서 객체를 생성하지 않으면 인스턴스 변수나 메소드를 사용할 수 없다.
*
*
* */
public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;  // 에러. 클래스변수는 인스턴스 변수를 참조할 수 없다.
    static int cv2 = new MemberCall().iv2;  // 객체를 생성하면 인스턴스 변수를 참조할 수 있다.

    // static 메소드와 멤버 변수 참조 관계
    static void staticMethod1() {
        System.out.println(cv); // static 변수 참조 O
//        System.out.println(iv);   // 에러. 인스턴스 변수 참조 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv);   // 객체를 생성하면 인스턴스 변수를 참조할 수 있다.
    }

    // 인스턴스 메소드와 멤버 변수 참조 관계
    void instanceMethod1() {
        System.out.println(cv); // static 변수 참조 O
        System.out.println(iv); // 인스턴스 변수 참조 O
    }

    // static 메소드와 멤버함수 호출 관계
    static void staticMethod2() {
        staticMethod1();    // 다른 static 메소드 호출 가능
//        instanceMethod1();    // 에러. 클래스메소드에서 인스턴스 메소드 호출 불가
        MemberCall c= new MemberCall();
        c.instanceMethod1();    // 인스턴스를 생성한 후에 인스턴스 메소드 호출 가능
    }

    // 인스턴스 메소드와 멤버함수 호출 관계
    void instanceMethod2() {
        staticMethod1();    // static 메소드 호출 가능
        instanceMethod1();  // 다른 인스턴스 메소드 호출 가능
    }
}
