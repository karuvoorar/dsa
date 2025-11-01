package basic.array;

public class CountOdd {

    /**
     * Given an array of n elements, return the count of odd numbers present in the
     * array.
     *
     * Examples:
     * Input: n = 5, array = [1, 2, 3, 4, 5]
     * Output: 3
     * Explanation: The three odd elements are 1, 3, and 5.
     *
     * Input: n = 6, array = [1, 2, 1, 1, 5, 1]
     * Output: 5
     * Explanation: The five odd elements are one 5 and four 1's.
     */

    public int countOdd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                ++count;
        }
        return count;
    }
}
