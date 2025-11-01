package basic.math;

public class GCD {

    /**
     * Given two integers n1 and n2, find the Greatest Common Divisor (GCD) of the
     * two numbers.
     * Return the GCD of the two numbers.
     *
     * The Greatest Common Divisor (GCD) of two integers is the largest positive
     * integer
     * that divides both of the integers.
     *
     * Examples:
     * Input: n1 = 4, n2 = 6
     * Output: 2
     * Explanation: Divisors of n1 = 1, 2, 4; Divisors of n2 = 1, 2, 3, 6.
     * Greatest Common Divisor = 2.
     *
     * Input: n1 = 9, n2 = 8
     * Output: 1
     * Explanation: Divisors of n1 = 1, 3, 9; Divisors of n2 = 1, 2, 4, 8.
     * Greatest Common Divisor = 1.
     */

    public int gcd(int n1, int n2) {

        // find smallest of both
        int num = n1;
        if (n1 > n2)
            num = n2;

        int result = 1;
        for (int i = 1; i <= num; i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                result = i;
            }
        }
        return result;
    }
}
