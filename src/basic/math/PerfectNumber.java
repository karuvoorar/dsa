package basic.math;

public class PerfectNumber {

    /**
     * Given an integer n, check if the number is a perfect number or not.
     * Return true if it is a perfect number, otherwise return false.
     *
     * A perfect number is a number whose proper divisors (excluding the number
     * itself)
     * add up to the number itself.
     *
     * Examples:
     * Input: n = 6
     * Output: true
     * Explanation: Proper divisors of 6 are 1, 2, 3. 1 + 2 + 3 = 6.
     *
     * Input: n = 4
     * Output: false
     * Explanation: Proper divisors of 4 are 1, 2. 1 + 2 = 3.
     */
    public boolean isPerfect(int n) {

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }

            if (sum == n) {
                return true;
            }

            if (sum > n) {
                return false;
            }
        }
        return false;
    }
}
