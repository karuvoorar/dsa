package basic.math;

public class CountDigits {

    /**
     * Given an integer n, return the number of digits present in the number.
     * Note: The number will not have leading zeroes, except when the number is 0
     * itself.
     * Example:
     * Input: n = 4
     * Output: 1
     */

    public int countDigit(int n) {

        if (n == 0)
            return 1;

        int count = 0;
        int value = n;
        while (value != 0) {
            value = value / 10;
            ++count;
        }
        return count;
    }
}
