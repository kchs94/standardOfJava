package ch6_oop.ex25;

/*
* 생성자에서 다른 생성자 호출하기
* 1.생성자의 이름으로 클래스이름 대신 this를 사용합니다.
* 2.한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능합니다.
*
* this: 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있습니다. 모든 인스턴스 메소드는 지역변수로 this를 가지고 있습니다.
* this(), this(매개변수): 생성자. 생성자 안에서 다른 생성자를 호출할 때 사용합니다.
* */
public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

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

    Car() {
        this("white", "auto", 4);   // 생성자 안에서 다른 생성자를 첫 줄에서 호출
    }
    Car(String color) {
        this(color, "auto", 4);     // 생성자 안에서 다른 생성자를 첫 줄에서 호출
    }

    Car(String color, String gearType, int door) {
        this.color = color; // this: 인스턴스 자신을 가리키는 참조변수
        this.gearType = gearType;
        this.door = door;
    }
}
