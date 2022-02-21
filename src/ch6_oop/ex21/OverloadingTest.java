package ch6_oop.ex21;
/*
* 메소드 오버로딩: 한 클래스 안에서 같은 이름의 메서드를 여러 개 정의하는 것을 말합니다.
* 오버로딩의 조건
* 1.메소드 이름이 같아야 합니다.
* 2.매개변수의 개수 또는 타입이 달라야합니다.
* 주의할점
* - 반환 타입은 오버로딩과 관련이 없습니다.
* 오버로딩의 장점(=오버로딩이 개념이 등장하기 전 불편한 점을 생각해보면 됩니다)
* 1.메소드를 작성하는 사람은 이름 짓기가 쉽습니다.
* 2.메소드를 사용하는 사람은 이름을 기억하기가 쉽습니다.
*
* */
public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과: " + mm.add(3,3));
        System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.println("int add(int a, int b) - ");
        return a+b;
    }

    long add(int a, long b) {
        System.out.println("long add(int a, long b - ");
        return a+b;
    }

    long add(long a, int b) {
        System.out.println("long add(long a, int b - ");
        return a+b;
    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b - ");
        return a+b;
    }

    int add(int[] a) {
        System.out.println("int add(int[] a) - ");
        int result = 0;
        for (int i=0; i<a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
