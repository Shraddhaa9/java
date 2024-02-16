package demo14;

// append with whitespace ''logic checked from internet''

import java.util.*;

public class demo14 {
    public static void reverseByWords(String str) {
        ArrayList<String> als = new ArrayList<String>(Arrays.asList(str.split(" ", 0)));
        // System.out.println(als);

        StringBuilder sb = new StringBuilder();
        for (int i = als.size() - 1; i >= 0; i--) {
            sb.append(als.get(i));
            sb.append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "Hello world";

        reverseByWords(str);
    }
}
