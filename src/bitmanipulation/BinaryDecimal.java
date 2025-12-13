package bitmanipulation;

public class BinaryDecimal {

    public static void main(String[] args) {
        int x = 13;
        System.out.println("Integer = " + x);
        System.out.println(decimalToBinary(x));
        x = 7;
        System.out.println("Integer = " + x);
        System.out.println(decimalToBinary(x));
        System.out.println(binaryToDecimal(decimalToBinary(x)));
    }

    private static String decimalToBinary(int x) {

        if (x == 1)
            return "1";
        if (x == 0)
            return "0";

        String res = "";

        while (x != 1 && x != 0) {

            res = (x % 2) + res;
            x = x / 2;

        }

        res = x + res;
        return res;
    }

    private static int binaryToDecimal(String binary) {

        double sum = 0;

        for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {

            int bit = binary.charAt(i) - '0';
            sum += bit * Math.pow(2, j);
        }

        return (int) sum;
    }
}
