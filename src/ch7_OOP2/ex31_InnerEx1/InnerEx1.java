package ch7_OOP2.ex31_InnerEx1;

// 외부 클래스
public class InnerEx1 {

    // 1.인스턴스 클래스 -인스턴스 변수 특징을 갖는다. -클래스의 특징을 갖는다.
    class InstanceInner {
        int iv = 100;
//        static int cv = 100;  // 에러. static 변수 사용 불가
        final static int CONST = 100;   // final static은 상수이므로 언제든지 가능
    }

    // 2.static 클래스 -static 변수(클래스 변수) 특징과 비슷하다. -클래스 특징도 갖는다.
    static class StaticInner {
        int iv = 200;
        static int cv = 200;    // static 클래스만 static 멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {  // 3.지역클래스: 외부 클래스 메소드나 초기화 블럭 안에 선언한다.
            int iv = 300;
//            static int cv = 300;  // static 변수를 선언할 수 없다.
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
