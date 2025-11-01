package basic.math;

public class LargestNumberDigit {

    /**
     * Given an integer n, return the largest digit present in the number.
     *
     * Example:
     * Input: n = 25
     * Output: 5
     * Explanation: The largest digit in 25 is 5.
     */

    public int largestDigit(int n) {
        if (n < 10)
            return n;

        int highestNum = 0;
        while (n != 0) {
            int value = n % 10;
            if (value > highestNum)
                highestNum = value;

            n = n / 10;
        }
        return highestNum;
    }
}
