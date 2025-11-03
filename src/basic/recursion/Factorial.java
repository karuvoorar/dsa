package basic.recursion;

public class Factorial {

    /**
     * Given an integer n, return the factorial of n.
     *
     * The factorial of a non-negative integer n is the product of all
     * positive integers less than or equal to n.
     * (Use 64-bit data type to store the result.)
     *
     * Examples:
     * Input: n = 3
     * Output: 6
     * Explanation: Factorial = 1 * 2 * 3 = 6
     *
     * Input: n = 5
     * Output: 120
     * Explanation: Factorial = 1 * 2 * 3 * 4 * 5 = 120
     */

    public long factorial(int n) {
        return fact(n, 1);
    }

    public long fact(int n, long result) {
        if (n == 0)
            return result;
        return fact(n - 1, result * n);
    }
}
