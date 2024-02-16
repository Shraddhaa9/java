package demo12;

// dynamic programming - rotating an array by k steps
import java.util.*;

public class demo12 {
    public static void rotateArray2(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            Collections.reverse(Arrays.asList(arr));
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        rotateArray(arr, 3);
        rotateArray2(arr, 3);
    }
}
