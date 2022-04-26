package ch8_ExceptionHandling.연습문제.문제9;

public class 문제9 {

    public static void main(String[] args) {


    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE = 100;

    public UnsupportedFunctionException(String message, int ERR_CODE) {

    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "";
    }
}