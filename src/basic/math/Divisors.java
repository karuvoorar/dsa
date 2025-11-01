package basic.math;

import java.util.Arrays;

public class Divisors {

    /**
     * Given an integer n, find all the divisors of n.
     * Return all the divisors of n as an array or list in sorted order.
     *
     * A number that completely divides another number is called its divisor.
     *
     * Examples:
     * Input: n = 6
     * Output: [1, 2, 3, 6]
     * Explanation: The divisors of 6 are 1, 2, 3, and 6.
     *
     * Input: n = 8
     * Output: [1, 2, 4, 8]
     * Explanation: The divisors of 8 are 1, 2, 4, and 8.
     */

    public int[] divisors(int n) {
        // Initial size of the array is set to n
        int[] temp = new int[n];
        int count = 0;

        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {

            // If a divisor is found
            if (n % i == 0) {
                // Add it to the array
                temp[count++] = i;
            }
        }

        /*
         * Copy the divisors to an
         * array of the exact size
         */
        int[] ans = Arrays.copyOf(temp, count);

        // Return the result
        return ans;
    }
}
