package ch6_oop.연습문제.문제5;

public class Exercise6_5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}

class Student {
    String name;    // 학생이름
    int ban;    // 반
    int no;     // 번호
    int kor;    // 국어점수
    int eng;    // 영어점수
    int math;   // 수학점수

    // 매개변수 있는 생성자를 통해 인스턴스 생성과 인스턴스 변수를 동시에 초기화합니다.
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;   // this는 인스턴스 자기 자신을 가리키는 참조변수입니다.
        this.ban = ban;     // 인스턴스 변수와 매개변수의 이름이 같을 때 구분하기 위해 사용합니다.
        this.no = no;       // 모든 인스턴스 메소드는 지역변수로 this를 숨겨서 가지고 있습니다.
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        double result = getTotal()/3f;
        return Math.round(result*10)/10.0f; //  소수점 두 번째 자리에서 반올림한 결과를 반환
    }

    String info() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage();
    }
}