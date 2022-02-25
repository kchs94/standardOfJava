package ch6_oop.연습문제.문제6;

/*
* 두 점 사이의 거리 = Math.sqrt((x1- x)^2 + (y1- y)^2)
* */
public class Exercise6_6 {
    // 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) { // 인스턴스 변수를 사용하지 않으므로 static 메소드로 정의
        return Math.sqrt(Math.pow(x1-x,2) + Math.pow(y1-y,2));
    }

    public static void main(String args[]) {
        System.out.println(getDistance(1,1,2,2));
    }
}
