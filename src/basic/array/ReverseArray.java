package basic.array;

public class ReverseArray {

    /**
     * Given an array arr of n elements, reverse the array in place.
     *
     * Examples:
     * Input: n = 5, arr = [1, 2, 3, 4, 5]
     * Output: [5, 4, 3, 2, 1]
     * Explanation: The reverse of the array [1, 2, 3, 4, 5] is [5, 4, 3, 2, 1].
     *
     * Input: n = 6, arr = [1, 2, 1, 1, 5, 1]
     * Output: [1, 5, 1, 1, 2, 1]
     * Explanation: The reverse of the array [1, 2, 1, 1, 5, 1] is [1, 5, 1, 1, 2,
     * 1].
     */
    public void reverse(int[] arr, int n) {
        int index = n - 1;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            --index;
        }
    }
}
