package ch7_OOP2.ex7_superConstructor;
/*
* super() - 조상 클래스의 생성자를 호출하는 데 사용됩니다.
* 자손 클래스는 조상 클래스의 멤버를 초기화하기 위해 자손 클래스 생성자에 조상 클래스의 생성자를 무조건 첫 줄에 호출해야합니다.
* 모든 클래스의 생성자는 첫 줄에 반드시 자신의 다른 생성자 또는 조상의 생성자를 호출해야합니다. 그렇지 않으면 컴파일러가 생성자의
* 첫 줄에 super();를 자동적으로 추가해줍니다.
* 생성자 첫 줄에 조상클래스의 생성자를 호출하는 이유는 자손 클래스의 멤버가 조상 클래스의 멤버를 사용할 수 있으므로
* 조상 멤버들이 먼저 초기화 되어있어야 하기 때문입니다.
*
* */
public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ",y: " + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return "x :" + x + ", y: " + y + ", z: " + z;
    }
}
