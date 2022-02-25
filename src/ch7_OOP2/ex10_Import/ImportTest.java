package ch7_OOP2.ex10_Import;

import java.text.SimpleDateFormat;
import java.util.Date;

// import java.*;   // 클래스 이름 대신 *을 사용하는 것은 하위 패키이즈이 클래스까지 포함시키는 것은 아니다.
public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }
}
