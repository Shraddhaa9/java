package demo8;

// remove duplicates from a string

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class demo8 {
    public static void removeDuplicates(String str) {
        String newStr = "";
        char[] arr = str.toCharArray();
        int n = arr.length;
        System.out.println("size: " + n);

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character, Integer> me = itr.next();
            if (me.getValue() > 1) {
                ;
                // newStr.replace(me.getKey(), "");
            } else {
                newStr = newStr + me.getKey();
            }
        }

        System.out.println(newStr);

    }

    public static void main(String[] args) {
        String str = "programming";
        removeDuplicates(str);
    }
}
