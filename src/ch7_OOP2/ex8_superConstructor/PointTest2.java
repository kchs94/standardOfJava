package ch7_OOP2.ex8_superConstructor;
/*
* 조상 클래스의 멤버변수는 조상의 생성자에 의해 초기화 되어야 한다.
* */
public class PointTest2 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point {
    int x=10;
    int y=20;

    Point(int x, int y) {
        // super(); == Object();
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
