package demo3;

// two-sum, three-sum, min-product, max-product, min-sum, max-sum

import java.util.*;

public class demo3 {
    public static void twoSumtargetSumThreeSum() {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int maxProd = Integer.MIN_VALUE;
        int minProd = Integer.MAX_VALUE;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(12);
        arr.add(56);
        arr.add(456);
        arr.add(79);
        arr.add(33);
        arr.add(-3);
        arr.add(-12);
        arr.add(-1);
        arr.add(2);

        // Array print
        System.out.println(arr.toString());

        // max sum
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > maxSum) {
                    maxSum = arr.get(i) + arr.get(j);
                }
            }
        }

        // min sum
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) < minSum) {
                    minSum = arr.get(i) + arr.get(j);
                }
            }
        }

        // max product
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) * arr.get(j) > maxProd) {
                    maxProd = arr.get(i) * arr.get(j);
                }
            }
        }

        // min product
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) * arr.get(j) < minProd) {
                    minProd = arr.get(i) * arr.get(j);
                }
            }
        }

        System.out.println("maxSum:" + maxSum);
        System.out.println("minSum:" + minSum);
        System.out.println("maxProd:" + maxProd);
        System.out.println("minProd:" + minProd);

        // min three sum
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = i + 1; j < arr.size() - 1; j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(i) + arr.get(j) + arr.get(k) < minSum)
                        minSum = arr.get(i) + arr.get(j) + arr.get(k);
                }
            }
        }

        System.out.println("minThreeSum:" + minSum);

        // target sum
        int targeTwoSum = -1;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == targeTwoSum) {
                    System.out.println("targeTwoSum: " + targeTwoSum + " found!!!");
                    System.out.println("indices: " + i + " " + j);
                }
            }
        }

        // target three sum
        int targetThreeSum = 18;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = i + 1; j < arr.size() - 1; j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(i) + arr.get(j) + arr.get(k) == targetThreeSum) {
                        System.out.println("targetThreeSum: " + targetThreeSum + " found!!!");
                        System.out.println("indices: " + i + " " + j + " " + k);
                    }
                    ;
                }
            }
        }
    }

    public static void twoSumWithTwoPointer() {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(5);
        arr.add(12);
        arr.add(27);
        arr.add(33);
        arr.add(45);
        arr.add(56);
        arr.add(67);
        arr.add(78);
        arr.add(89);

        // Array print
        System.out.println();
        System.out.println(arr.toString());
        int target = 60;

        int l = 0;
        int r = arr.size() - 1;

        int mid;

        while (l <= r) {
            mid = arr.get(l) + arr.get(r);
            if (mid == target) {
                System.out.println("twoSumWithTwoPointer: Two indices are " + l + " " + r);
                return;
            } else if (mid > target) {
                r = r - 1;
            } else if (mid < target) {
                l = l + 1;
            }
        }
    }

    public static void main(String[] args) {
        twoSumtargetSumThreeSum();

        // only possible two pointer with the sorted array only
        twoSumWithTwoPointer();
    }
}