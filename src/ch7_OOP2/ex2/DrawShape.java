package ch7_OOP2.ex2;
/*
* 클래스 간의 관계 2가지
*
* 상속관계: ~은 ~이다(is-a)
* ex) 사람은 동물이다. 사람 extends 동물
*
* 포함관계: ~은 ~을 가지고 있다.(has-a)
* EX) 원은 점을 가지고 있다.
* */
public class DrawShape {
    public static void main(String[] args) {
        Point[] p = { new Point(100, 100),
        new Point(140, 50),
        new Point(200, 100)};

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw();
        c.draw();
    }
}

// 도형
class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

// 점
class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0,0);
    }

    String getXY() {
        return "(" + x + ", " + y + ")";    // x와 y의 값을 문자열로 반환합니다.
    }
}

// 원은 도형이다 O
// 원은 점을 포함한다 O
class Circle extends Shape {
    Point center;   //원의 원점좌표
    int r;          // 반지름

    Circle() {
        this(new Point(0, 0), 100); // Circle(Point center, int r)을 호출
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n",
                center.x, center.y, r, color);
    }
}

// 삼각형은 도형이다.
// 삼각형은 점을 포함한다.
class Triangle extends Shape {
    Point[] p = new Point[3];
    Triangle(Point[] p) {
        this.p = p;
    }

    @Override
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
                p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}