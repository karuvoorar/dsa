package basic.array;

public class SortedArray {

    /**
     * Given an array arr of size n, check if the array is sorted in ascending
     * (increasing or non-decreasing) order.
     * Return true if the array is sorted, otherwise return false.
     *
     * Examples:
     * Input: n = 5, arr = [1, 2, 3, 4, 5]
     * Output: true
     * Explanation: The given array is sorted as every element is smaller than
     * or equal to its next element, so the answer is true.
     */

    boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                continue;
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
