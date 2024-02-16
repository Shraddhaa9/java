package demo11;

// union of two strings
import java.util.*;

public class demo11 {
    // NOT WORKING
    // public static Set<Character> stringUnion(String s1, String s2) {
    // String str = "";

    // Set<Character[]> set1 = new HashSet<Character[]>();
    // Set<Character[]> set2 = new HashSet<Character[]>();
    // Set<Character[]> union = new HashSet<Character[]>();

    // set1.add((Character[]) s1.toCharArray());
    // set2.add(s2.toCharArray());
    // union.addAll(set1);
    // union.addAll(set2);

    // return union;
    // }

    // WORKING
    public static String stringUnion(String s1, String s2) {
        // check for null as the method doesnt fall in NPE
        if (s1 == null || s2 == null) {
            return null;
        }

        // split the given String to some list
        List<String> s1List = Arrays.asList(s1.split(","));
        List<String> s2List = Arrays.asList(s2.split(","));

        // get a Set and add the list items to it. LinkedHashSet
        // is used to maintain the given order.
        Set<String> stringSet = new LinkedHashSet<>(s1List);
        stringSet.addAll(s2List);

        // Then join them using java 8 provided Utility
        return String.join(",", stringSet);
    }

    public static void main(String[] args) {
        String s1 = "this, is, string, 1";
        String s2 = "this, is, string, 2";

        System.out.println(stringUnion(s1, s2));
    }
}
