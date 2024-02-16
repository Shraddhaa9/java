package demo7;

// find duplicates in an array
import java.util.*;

public class demo7 {
    public static void findDuplicates(int[] arr) {
        int n = arr.length;
        System.out.println("size: " + n);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> me = itr.next();
            if (me.getValue() > 1) {
                System.out.println(me.getKey());
            }
        }

        // entrySet es = hm.entrySet();
        // for (es : )

        // System.out.println(hm);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 8, 4, 5, 2, 3 };

        findDuplicates(arr);
    }
}