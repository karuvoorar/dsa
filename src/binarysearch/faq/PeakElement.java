package binarysearch.faq;

public class PeakElement {

    /*
     * Given an array arr of integers. A peak element is defined as an element
     * greater than both of its neighbors.
     *
     *
     * Find the index(0-based) of a peak element in the array. If there are multiple
     * peak numbers, return the index of any peak number.
     *
     *
     * Note:
     *
     * As there can be many peak values, "true" is given as output if the returned
     * index is a peak number, otherwise "false".
     *
     * Examples:
     * Input : arr = [1, 2, 3, 4, 5, 6, 7, 8, 5, 1]
     *
     * Output: 7
     *
     * Explanation: In this example, there is only 1 peak that is at index 7.
     *
     * Input : arr = [1, 2, 1, 3, 5, 6, 4]
     *
     * Output: 1
     *
     * Explanation: In this example, there are 2 peak numbers at indices 1 and 5. We
     * can consider any of them.
     */
    public static int peakElement(int[] arr) {
        int ans = -1;
        int n = arr.length;

        // handle edge cases
        if (n == 0)
            return ans;
        if (n == 1)
            return arr[0];
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[n - 1] > arr[n - 2])
            return arr[n - 1];

        // use binary search since array is sorted
        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // find if the mid is answer
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] <= arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
        int[] arr2 = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println("Answer for 1: " + peakElement(arr1));
        System.out.println("Answer for 1: " + peakElement(arr2));
    }
}
