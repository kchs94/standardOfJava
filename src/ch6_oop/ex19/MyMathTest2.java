package ch6_oop.ex19;
/*
* -인스턴스 메소드: 인스턴스 변수와 관련된 작업을 하는 메소드.
* 다시 말해서 메소드 작업을 하는 과정에서 인스턴스 변수를 필요로 하는 메소드
* -클래스 메소드(static 메소드): 인스턴스와 관련없는 메소드. 다시 말해 메소드 정의에 인스턴스 변수와 인스턴스 메소드를 사용하지 않는 메소드
* -멤버변수: 인스턴스 변수 + 클래스 변수(static 변수). 클래스 영역에 선언된 변수를 멤버변수라고 말한다.
* 1.멤버 변수 중 모든 인스턴스가 공통으로 사용하는 변수는 static을 붙인다. 즉  static 변수로 사용한다.
* 2.클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다. static 변수는 클래스가 메모리에 올라갈 때 자동적으로 생성된다.
* 3.클래스 메소드(static 메소드)는 인스턴스 변수를 사용할 수 없다. 왜냐하면 클래스 메소드가 호출되었을 때 인스턴스 변수가 존재하지 않을 수 있기
* 때문이다.
* 4.메소드 안에서 인스턴스 변수를 사용하지 않는다면. static을 붙인다. 인스턴스 메소드는 실행 시 호출되어야할 메소드를 찾는 과정이 추가되기 때문에
* 성능이 더 떨어진다.
* */
public class MyMathTest2 {
    public static void main(String[] args) {
        // 클래스메소드 호출. 인스턴스 생성없이 호출이 가능하다. 매개변수가 필요하다.
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        // 인스턴스메소드는 객체를 생성한 후에 호출이 가능하다. 매개변수가 필요없다.
        MyMath2 obj = new MyMath2();
        obj.a = 200L;
        obj.b = 100L;
        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}

class MyMath2 {
    long a, b;

    // 인스턴스 메소드: 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    // 클래스 메소드(static 메소드): 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b){ return a + b;}
    static long subtract(long a, long b){ return a - b;}
    static long multiply(long a, long b){ return a * b;}
    static double divide(double a, double b){ return a / b;}

}
