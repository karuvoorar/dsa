package basic.recursion;

public class SumDigits {

    /**
     * Given an integer num, repeatedly add all its digits until the result
     * has only one digit, and return it.
     *
     * Examples:
     * Input : num = 529
     * Output : 7
     * Explanation :
     * First iteration: 5 + 2 + 9 = 16
     * Second iteration: 1 + 6 = 7
     * Now only one digit remains, so we return 7.
     *
     * Input : num = 101
     * Output : 2
     * Explanation :
     * First iteration: 1 + 0 + 1 = 2
     * Now only one digit remains, so we return 2.
     */

    public static void main(String[] num) {
        System.out.println(add(1342));
    }

    public static int add(int num) {
        if(num%10 == num) return num;

        return num%10 + add(num/10);
    }
}
