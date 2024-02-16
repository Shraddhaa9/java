package demo6;

// character counts in a particular string

import java.util.*;

public class demo6 {
    public static void charCount(String str) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }

        System.out.println("str: " + str + hm);
    }

    public static void main(String[] args) {
        String str = "test string here it is";

        charCount(str);
    }
}
