package basic.math;

public class PrimeNumbers {

    /**
     * Given an integer n, check if the number is prime or not.
     * Return true if it is a prime number, otherwise return false.
     *
     * A prime number is a number that has no divisors except 1 and itself.
     *
     * Examples:
     * Input: n = 5
     * Output: true
     * Explanation: The only divisors of 5 are 1 and 5, so 5 is a prime number.
     *
     * Input: n = 8
     * Output: false
     * Explanation: The divisors of 8 are 1, 2, 4, and 8, so it is not a prime
     * number.
     */

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
