package 코드스테이츠.열거형;
/*
* enum: 연관된 상수들의 집합
* enum의 장점
* 1.상수명의 중복을 피할 수 있다.
* 2.타입에 대한 안정성을 보장한다.
* 3.코드가 단순해지고, 가독성이 좋아진다.
* 4.switch문에서 사용할 수 있다.
* enum 탄생 배경: public static final --> (상수명 중복 문제) --> 인터페이스 --> (타입 안정성 문제) --> 사용자 정의 클래스 --> (코드 복잡, switch x)
* --> Enum 탄생
* 특징
* - 열거 상수도 객체다.
* */

enum Seasons {SPRING, SUMMER, FALL, WINTER}

public class EnumEx {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SPRING;
        System.out.println(favoriteSeason);
    }
}
