package ch7_OOP2.ex18_Binding;
/*
* 멤버변수가 조상 클래스와 자손 클래스에 중복으로 사용된 경우,
* 조상타입의 참조변수를 사용하면 조상 클래스에 선언된 멤버변수가 사용된다.
* 반면, 자손타입의 참조변수를 사용하면 자손 클래스에 선언된 멤버변수가 사용된다.
* 메소드의 경우 참조변수에 상관없이 항상 실제 인스턴스의 메소드(오버라이딩된 메소드)가 호출된다.
* */
public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x); // 조상타입의 참조변수를 사용했을 때 조상 클래스에 선언된 멤버변수가 사용된다.
        p.method();

        System.out.println("c.x = " + c.x); // 자손타입의 참조변수를 사용했을 때 자손 클래스에 선언된 멤버변수가 사용된다.
        c.method();
    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}