package ch7_OOP2.ex14_accessmodifierOfConstructor;

public final class Singleton {  // final 클래스: 자손 클래스를 만들 수 없다.
    private static Singleton s = new Singleton()/   // getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어있어야한다.

    private Singleton() {   // 생성자 접근 제어자를 private으로 함으로써 외부에서 인스턴스를 생성하는 것을 막는다.
                            // 외부에서 생성자를 호출할 수 없으므로 인스턴스를 만들지 못한다. 하지만 클래스 내부에서는 만들 수 있다.
    }   // 생성자가 private인 클래스는 다른 클래스의 조상클래스가 될 수 없다.
        // 왜냐면, 자손클래스의 인스턴스를 생성할 때 조상클래스의 생성자를 호출해야되는데 private이므로 호출이 불가능하기 때문이다.

    // 인스턴스를 생성하지 않고 호출할 수 있어야 하므로 static이어야 한다.
    public static Singleton getInstance() {
        return s;
    }
}
