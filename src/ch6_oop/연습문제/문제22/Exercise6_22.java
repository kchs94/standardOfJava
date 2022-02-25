package ch6_oop.연습문제.문제22;

public class Exercise6_22 {

    public static boolean isNumber(String str) {
        boolean answer = true;

        if (str == null || str.equals("")) {
            return answer = false;
        }

        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                answer = false;
                break;  // 끝까지 탐색할 이유가 없으므로
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니? " + isNumber(str));
    }
}
