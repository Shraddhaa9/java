package demo18;

// move zeros to the end
import java.util.*;

public class demo18 {
    public static void moveZeros(int[] arr) {

        System.out.println("Before: " + Arrays.toString(arr));
        // for zeros
        for (int i = 0; i < arr.length - 1; i++) {
            // for non-zeros
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] != 0) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(arr));
    }

    public static void enhancedMoveZeros(int[] arr) {
        System.out.println("Before enhancedMoveZeros: " + Arrays.toString(arr));

        // base case
        int n = arr.length;
        int l = 0;
        int r = 1;

        while (r < n) {
            if (arr[l] != 0) {
                l++;
                r++;
            } else if (arr[r] == 0) {
                r++;
            } else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        System.out.println("After enhancedMoveZeros: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };

        moveZeros(arr);

        int[] arr2 = { 0, 1, 0, 3, 12 };
        enhancedMoveZeros(arr2);
    }
}
