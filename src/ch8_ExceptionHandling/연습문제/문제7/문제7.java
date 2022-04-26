package ch8_ExceptionHandling.연습문제.문제7;

public class 문제7 {

    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b)
                System.exit(0);
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        //1
        method(false);
    }
}
