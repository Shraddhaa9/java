package demo17;

import java.util.*;

// perform binary search, input array and target
public class demo17 {
    public static int doBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int enhancedBinarySearch(int[] arr, int start, int end, int target) {
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 4, 5, 7, 8, 9, 34, 45, 67, 89, 99, 121, 224, 321, 456, 567,
                678, 789, 890, 990, 1000 };
        int target = 990;

        int found;
        found = doBinarySearch(arr, target);
        if (found > 0) {
            System.out.println("Element found!!!");
        }

        found = enhancedBinarySearch(arr, 0, arr.length - 1, target);
        if (found > 0) {
            System.out.println("enhancedBinarySearch: Element found!!!");
        }
    }
}
