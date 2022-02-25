package ch6_oop.연습문제.문제20;
import java.util.Arrays;

public class Exercise6_20 {
    public static int[] shuffle(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int a = (int)(Math.random()*arr.length);  // 0~1.0*9
            int b = (int)(Math.random()*arr.length);

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
