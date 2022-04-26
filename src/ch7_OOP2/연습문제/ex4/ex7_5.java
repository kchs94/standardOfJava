package ch7_OOP2.연습문제.ex4;
/*
* 정답: Product 클래스에서 기본 생성자를 작성해야한다.
* 왜냐면 Tv 인스턴스를 만들 때, 생성자 Tv()가 호출되고 그 안에서 조상 생성자 super()가 호출된다.
* 실제코드에서는 super()가 없지만 컴파일 시점에 컴파일러가 자동으로 넣어준다.
* 하지만 문제에서는 Product 클래스에 기본 생성자가 정의되어 있지 않으므로 컴파일 에러가 발생하게 된다.
* Product에는 이미 다른 생성자가 작성되어 있기 때문에 컴파일러가 기본 생성자를 자동으로 넣어주지 않는다.
* */
class Product {
    int price;  // 제품 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product() {}    // 정답

    // 생성자
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product {
    Tv() {}
    public String toString() {
        return "Tv";
    }
}

public class ex7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
