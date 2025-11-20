package binarysearch.matrix;

import java.util.Arrays;

public class SearchInMatrix {

    /*
     * Given a 2-D array mat where the elements of each row are sorted in
     * non-decreasing order, and the first element of a row is greater than the last
     * element of the previous row (if it exists), and an integer target, determine
     * if the target exists in the given mat or not.
     *
     *
     * Examples:
     * Input: mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
     *
     * Output: True
     *
     * Explanation: The target = 8 exists in the 'mat' at index (1, 3).
     *
     * Input: mat = [ [1, 2, 4], [6, 7, 8], [9, 10, 34] ], target = 78
     *
     * Output: False
     *
     * Explanation: The target = 78 does not exist in the 'mat'. Therefore in the
     * output, we see 'false'.
     */
    public static boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        int len = (rows * cols) - 1;

        int low = 0, high = len;

        while (low <= high) {
            // find the mid considering the matrix as 1D
            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (mat[row][col] == target)
                return true;
            else if (mat[row][col] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println("Searching in matrix... \n" + Arrays.deepToString(arr));

        if (searchMatrix(arr, 11))
            System.out.println("Value found");
        else
            System.out.println("Value NOT found");

    }

}
