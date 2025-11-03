package basic.recursion;

public class Fibonacci {

    /**
     * The Fibonacci numbers, commonly denoted F(n), form a sequence such that each
     * number
     * is the sum of the two preceding ones, starting from 0 and 1.
     * 
     * Formula:
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1
     *
     * Given n, calculate F(n) using recursion.
     *
     * Examples:
     * Input : n = 2
     * Output : 1
     * Explanation : F(2) = F(1) + F(0) => 1 + 0 => 1
     *
     * Input : n = 3
     * Output : 2
     * Explanation : F(3) = F(2) + F(1) => 1 + 1 => 2
     */
    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
