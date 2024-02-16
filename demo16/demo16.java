package demo16;

// Check weather a string is palindrome or not
public class demo16 {
    public static void checkPalindrome(String str) {
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome == true) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static void checkPalindromeAgain(String str) {
        boolean isPalindrome = true;

        str.toLowerCase();

        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("String is Palindrome from checkPalindromeAgain");
        } else {
            System.out.println("String is NOT Palindrome from checkPalindromeAgain");
        }
    }

    public static void main(String[] args) {
        // String str = "geeks for rof skeeg";
        String str = "hello world";

        checkPalindrome(str);

        checkPalindromeAgain(str);
    }
}
