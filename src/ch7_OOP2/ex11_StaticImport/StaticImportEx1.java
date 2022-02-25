package ch7_OOP2.ex11_StaticImport;

import static java.lang.System.out; // static 멤버인 out을 참조할 때 클래스명 System 생략가능
import static java.lang.Math.*;     // Math 클래스의 모든 static 멤버를 사용할 때 클래스명 Math 생략가능

public class StaticImportEx1 {
    public static void main(String[] args) {
//        System.out.println(Math.random());
        out.println(random());

//        System.out.println("Math.PI: " + Math.PI);
        out.println("Math.PI: " + PI);
    }
}
