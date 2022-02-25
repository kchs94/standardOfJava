package ch7_OOP2.ex5_super1;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
    }
}

class Parent {
    int x=10;
}

class Child extends Parent {
    void method1() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
