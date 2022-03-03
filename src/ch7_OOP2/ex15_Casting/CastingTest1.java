package ch7_OOP2.ex15_Casting;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        // car.water(); // Car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine)car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;
    void drive() {
        System.out.println("운전중~~~");
    }
    void stop() {
        System.out.println("브레이크!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("물 뿌리기!!!");
    }
}