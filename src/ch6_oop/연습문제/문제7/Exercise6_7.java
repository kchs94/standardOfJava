package ch6_oop.연습문제.문제7;

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        // p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 인스턴스 메소드
    double getDistance(int x1, int y1) {    // 인스턴스 변수 x,y를 사용하므로 static을 붙이지 않는다.
        return Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y,2));
    }
}