package ch11_컬렉션프레임워크.ex2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijkfaehfapfoaefjsafasefjasei";
        int length = source.length();

        List list = new ArrayList(length/LIMIT + 10);

        for (int i=0; i<length; i+=LIMIT) {
            if (i+LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }

        for (Object e : list)
            System.out.println(e);
    }
}
