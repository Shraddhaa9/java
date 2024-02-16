package demo19;

// Convert an integer to binary
public class demo19 {

    public static void main(String[] args) {
        int numInt = 25;
        String numBinary = "";
        String strBinary = "";

        while (numInt != 0) {
            strBinary = strBinary + numInt % 2;
            numInt = numInt / 2;
        }

        for (int i = strBinary.length() - 1; i >= 0; i--) {
            numBinary = numBinary + strBinary.charAt(i);
        }

        System.out.println("Binary number is: " + numBinary);
    }
}
