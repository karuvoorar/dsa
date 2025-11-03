package basic.recursion;

public class SumNumbers {

    /**
     * Given an integer N, return the sum of the first N natural numbers using
     * recursion.
     *
     * Examples:
     * Input: N = 4
     * Output: 10
     * Explanation: The first four natural numbers are 1, 2, 3, and 4.
     * Their sum is 1 + 2 + 3 + 4 = 10.
     *
     * Input: N = 2
     * Output: 3
     * Explanation: The first two natural numbers are 1 and 2.
     * Their sum is 1 + 2 = 3.
     */

    public int NnumbersSum(int N) {
        return sum(N, 0);
    }

    public int sum(int n, int sum) {
        if (n == 0)
            return sum;
        return sum(n - 1, sum + n);
    }
}
