package basic.math;

public class LCM {

    /**
     * Given two integers n1 and n2, find the Lowest Common Multiple (LCM) of the
     * two numbers.
     * Return the LCM of the two numbers.
     *
     * The Lowest Common Multiple (LCM) of two integers is the smallest positive
     * integer
     * that is divisible by both of the integers.
     *
     * Examples:
     * Input: n1 = 4, n2 = 6
     * Output: 12
     * Explanation: 4 * 3 = 12, 6 * 2 = 12.
     * 12 is the lowest integer that is divisible by both 4 and 6.
     *
     * Input: n1 = 3, n2 = 5
     * Output: 15
     * Explanation: 3 * 5 = 15, 5 * 3 = 15.
     * 15 is the lowest integer that is divisible by both 3 and 5.
     */

    public int lcm(int n1, int n2) {
        int result = 0;
        int counter = 1;
        while (result == 0) {
            int multiple = n1 * counter;
            if (multiple % n2 == 0)
                return multiple;
            ++counter;
        }
        return result;
    }
}
