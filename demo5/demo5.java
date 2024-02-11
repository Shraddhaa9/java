package demo5;

// find sum of a numers present in a string

public class demo5 {
    /**
     * @param str
     * @return
     */
    public static int findSum(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num = num + str.charAt(i);
            } else {
                if (!num.equals("")) {
                    sum = sum + Integer.parseInt(num);
                    num = "";
                }
            }
        }

        if (!num.equals("")) {
            sum = sum + Integer.parseInt(num);
            num = "";
        }

        return sum;
    }

    // public static int findSum2(String str) {
    // int sum = 0;
    // int num = 0;

    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i)) >= '0' && str.charAt(i)) <= '9')
    // {
    // num = num*10 + (int)(str.charAt(i) - '0');
    // } else {
    // sum = sum + num;
    // num = 0;
    // }

    // }
    // return sum;
    // }

    public static void main(String[] args) {
        String s = "abc12b3vf4";

        System.out.println(findSum(s));
    }
}
