package ch6_oop.ex22;

/*
* 가변인자란 무엇인가요?
* 매개변수 갯수를 동적으로 지정하는 기능을 말합니다.
* '타입... 변수명'으로 선언합니다.
* 매개변수 중에서 가장 마지막에 선언해야합니다. 왜내하면 가변인자인지 아닌지 구분하기 어렵기 때문입니다.
* 가느한 가변인자를 사용하는 메소드는 오버로딩을 하지 않습니다.
* */
public class VarArgsEx {

    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};
        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));

    }

    static String concatenate(String delim, String... args) {
        String result = "";
        for (String str : args) {
            result += str + delim;
        }
        return result;
    }
    /*
    static String concatenate(String... args) {
        return concatenate("", args);
    }
    */
}


