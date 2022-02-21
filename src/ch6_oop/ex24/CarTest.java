package ch6_oop.ex24;

/*
* 매개변수가 있는 생성자
*
* 기본 생성자를 사용하면 인스턴스를 생성한 후에 따로 인스턴스 변수를 초기화해줘야 합니다.
* 반면 매개변수가 있는 생성자를 사용하면 인스턴스 생성과 인스턴스 변수 초기화를 동시에 할 수 있는 장점이 있습니다.
* 또한 코드가 더 간결하고 직관적입니다.
*
* */
class Car {
    // 인스턴스 변수들
    String color;   //색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;   // 문의 갯수

    // 기본 생성자
    Car() {}

    // 매개변수가 있는 생성자
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class CarTest {
    public static void main(String[] args) {
        // 기본 생성자를 사용하면 인스턴스 생성 후에 따로 인스턴스 변수를 초기화 해야한다.
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        // 매개변수 있는 생성자를 사용하면 인스턴스를 생성함과 동시에 인스턴스 변수를 초기화할 수 있는 장점이 있다.
        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1의 color" + c1.color + ", gearType="
        + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color" + c2.color + ", gearType="
        + c2.gearType + ", door=" + c2.door);
    }
}
