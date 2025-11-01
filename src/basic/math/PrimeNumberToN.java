package basic.math;

public class PrimeNumberToN {

    /**
     * Given an integer n, find the number of prime numbers in the range [1, n]
     * (inclusive).
     * Return the count of prime numbers in that range.
     *
     * A prime number is a number that has no divisors except 1 and itself.
     *
     * Examples:
     * Input: n = 6
     * Output: 3
     * Explanation: Prime numbers in the range [1, 6] are 2, 3, and 5.
     *
     * Input: n = 10
     * Output: 4
     * Explanation: Prime numbers in the range [1, 10] are 2, 3, 5, and 7.
     */

    public int primeUptoN(int n) {

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                ++count;
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n <= 3)
            return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
