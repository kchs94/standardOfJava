package ch7_OOP2.ex19_Binding2;
/*
* 참조변수의 타입에 따라 결과가 달라지는 경우는 조상클래스의 멤버변수와 같은 이름의 멤버변수를 자손클래스에
* 중복해서 정의한 경우뿐이다.
* */
public class BindingTest2 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("부모 메소드");
    }
}
class Child extends Parent {

}