package demo13;

// reverse an entire string
public class demo13 {
    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseString(str));
    }
}
