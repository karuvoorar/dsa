package basic.math;

public class Factorial {

    /**
     * Given an integer n, return the value of n! (n factorial).
     *
     * The factorial of a number is the product of all positive integers
     * less than or equal to that number.
     *
     * Example:
     * Input: n = 2
     * Output: 2
     * Explanation: 2! = 1 * 2 = 2.
     */

    public int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        int sum = 1;
        while (n > 1) {
            sum = sum * n;
            --n;
        }
        return sum;
    }
}
