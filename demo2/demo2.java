package demo2;

// iterator as well as forward and backward traversing of an array

import java.util.*;

public class demo2 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(55);
        al.add(66);

        System.out.println(al.toString());
        System.out.println("forward: ");

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("reverse: ");

        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.println(al.get(i));
        }
    }
}
