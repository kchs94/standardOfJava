package ch6_oop.ex26_생성자를이용한인스턴스복사;

/*
* 생성자를 이용한 인스턴스 복사
* 생성자 매개변수로 참조변수를 선언하여 인스턴스를 복사할 수 있습니다.
*
* 인스턴스를 생성할 때는 2가지를 결정해야합니다.
* 1.클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
* 2.생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?
* */
public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);   // c1의 인스턴수 변수 값으로 c2를 생성합니다.

        System.out.println("c1의 color=" + c1.color + ", gearType="
                + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
                + c2.gearType + ", door=" + c2.door);

        c1.door = 100;  // c1의 인스턴스변수 door 값을 변경합니다.

        System.out.println("c1의 color=" + c1.color + ", gearType="
                + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
                + c2.gearType + ", door=" + c2.door);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    // 생성자를 이용한 인스턴스 복사
    Car(Car c){
//        this.color = c.color;   // 값 복사
//        this.gearType = c.gearType;
//        this.door = c.door;
        this(c.color, c.gearType, c.door);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
