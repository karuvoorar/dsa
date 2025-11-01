package basic.math;

public class CountOddDigits {

    /**
     * Given an integer n, return the number of odd digits present in the number.
     * Note: The number will not have leading zeroes, except when the number is 0
     * itself.
     * Example:
     * Input: n = 5
     * Output: 1
     * Explanation: 5 is an odd digit.
     */

    public int countOddDigit(int n) {
        if (n == 0)
            return 0;

        int count = 0;
        int value = n;
        while (value != 0) {
            if (value % 2 != 0)
                ++count;

            value = value / 10;
        }
        return count;
    }
}
