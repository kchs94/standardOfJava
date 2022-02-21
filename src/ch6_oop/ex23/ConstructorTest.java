package ch6_oop.ex23;

// 정의된 생성자가 없으므로 컴파일러가 기본 생성자를 추가해준다.
class Data1 {
    int value;
}

// 정의된 생성자가 있으므로 컴파일러가 기본 생정자를 추가로 생성하지 않는다.
class Data2 {
    int value;
    Data2(int value) {
        this.value = value;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2();   // Data2에는 생성자 Data2()가 정의되어 있지 않기 때문에 컴파일 에러가 발생합니다.
        Data2 d2 = new Data2(10);
    }
}
