package demo10;

// check weather a number is palindrome or not
import java.util.*;

public class demo10 {
    public static void checkPalindrome(int n) {
        int oriN = n;
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (oriN == rev) {
            // System.out.println("reversed number: " + rev);
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        checkPalindrome(n);
    }
}
