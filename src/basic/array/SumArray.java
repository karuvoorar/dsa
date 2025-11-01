package basic.array;

public class SumArray {

    /**
     * Given an array arr of size n, find the sum of all the elements in the array.
     *
     * Examples:
     * Input: n = 5, arr = [1, 2, 3, 4, 5]
     * Output: 15
     * Explanation: Sum of all the elements is 1 + 2 + 3 + 4 + 5 = 15.
     */

    public int sum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
