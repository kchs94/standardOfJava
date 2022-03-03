package ch7_OOP2.ex20_Binding3;
/*
* 자손 클래스 Child에 선언된 인스턴스 변수 x와 조상 클래스 Parent로부터 상속받은 인스턴스 변수 x를 구분하는데
* 참조변수 super와 this가 사용된다.
* super.x: 조상 클래스 Parent에 선언된 인스턴스 변수
* this.x or x : Child 클래스의 인스턴스 변수 x
* */
public class BindingTest3 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x); // 100
        p.method(); // 인스턴스 메소드
        System.out.println();
        System.out.println("c.x = " + c.x); // 200
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
        System.out.println("x=" + x);   // this.x와 같다   // 200
        System.out.println("super.x=" + super.x);   // 100
        System.out.println("this.x=" + this.x);     // 200
    }
}
