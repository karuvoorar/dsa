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

    public int addDigits(int num) {
        return add(num, 0);
    }

    public int add(int num, int sum) {
        int rev = num;
        if (rev == 0) {
            if (sum >= 10) {
                rev = sum;
                sum = 0;
            } else
                return sum;
        }

        return add(rev / 10, sum + rev % 10);
    }
}
