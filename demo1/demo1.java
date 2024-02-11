package demo1;

// get sum of each digits present in a number

public class demo1 {

    public static int getSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static int getSumAgain(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 123456789;

        System.out.println(getSum(n));

        System.out.println(getSumAgain(n));
    }
}
