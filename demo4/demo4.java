// need to work on this

// digits are present in a array, increment the number and return digits in an array 

package demo4;

class demo4 {
    public static int[] plusOne(int[] digits) {
        int num = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(digits[i]);
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            num = 10 ^ (digits.length - i - 1) * digits[i] + num;
            System.out.println("digits[i]: " + digits[i]);
            System.out.println("digits.length - i - 1: " + (digits.length - i - 1));
            System.out.println("10 ^ (digits.length - i - 1): " + (10 ^ (digits.length - i - 1)));
            System.out
                    .println("10 ^ (digits.length - i - 1) * digits[i]: " + (10 ^ (digits.length - i - 1) * digits[i]));
            System.out.println("10 ^ (digits.length - i - 1) * digits[i] + num: " + (10
                    ^ (digits.length - i - 1) * digits[i] + num));
        }

        // increment number by 1
        num = num + 1;
        System.out.println("num: " + num);

        int[] updatedDigits = new int[digits.length];
        int idx = digits.length - 1;
        while (num != 0) {
            updatedDigits[idx] = num % 10;
            num = num / 10;
            idx = idx - 1;
        }

        // System.out.println(updatedDigits.toString());

        for (int i = updatedDigits.length - 1; i >= 0; i--) {
            System.out.println(updatedDigits[i]);
        }

        return updatedDigits;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };

        System.out.println(plusOne(digits).toString());
    }
}