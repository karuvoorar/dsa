package basic.math;

public class Palindrome {

    /**
     * Given an integer n, check whether the number is a palindrome or not.
     * Return true if it's a palindrome number, otherwise return false.
     *
     * A palindrome number reads the same both left to right and right to left.
     *
     * Example:
     * Input: n = 121
     * Output: true
     * Explanation:
     * When read from left to right: 121
     * When read from right to left: 121
     */

    public boolean isPalindrome(int n) {
        if (n < 10)
            return true;

        int value = n;
        int revNum = 0;

        while (value != 0) {
            revNum = (revNum * 10) + value % 10;
            value = value / 10;
        }

        if (revNum == n)
            return true;
        else
            return false;
    }
}
