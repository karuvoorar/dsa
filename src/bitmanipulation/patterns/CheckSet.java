package bitmanipulation.patterns;

public class CheckSet {

    public static void main(String[] args) {
        int x = 13;
        System.out.println("Integer = " + x);
        System.out.println(decimalToBinary(x));
        System.out.println(checkBitSetWithLeftShift(x, 2));

        x = 13;
        System.out.println("Integer = " + x);
        System.out.println(decimalToBinary(x));
        System.out.println(checkBitSetWithLeftShift(x, 1));
    }

    public static boolean checkBitSetWithLeftShift(int num, int index) {

        // left shift
        int shifted = 1 << index;

        System.out.println("Shifted "+ shifted);

        int ans = num & shifted;

        if (ans != 0)
            return true;

        return false;
    }

    public static String decimalToBinary(int num) {

        String ans = "";

        while (num != 1 && num != 0) {
            ans = (num % 2) + ans;
            num = num / 2;
        }

        if (num == 1)
            ans = num + ans;

        return ans;
    }
}
