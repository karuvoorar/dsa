package basic.math;

public class ReverseNumber {

    /**
     * Given an integer n, return the integer formed by placing the digits of n in
     * reverse order.
     * Example:
     * Input: n = 25
     * Output: 52
     * Explanation: Reverse of 25 is 52.
     */

    public int reverseNumber(int n) {
        if (n < 10)
            return n;

        int value = n;
        int reverseNumber = 0;
        while (value != 0) {
            reverseNumber = (reverseNumber * 10) + value % 10;
            value = value / 10;
        }
        return reverseNumber;
    }
}