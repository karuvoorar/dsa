package binarysearch.matrix;

public class SearchInMatrixII {

    /*
     * Given a 2D array matrix where each row is sorted in ascending order from left
     * to right and each column is sorted in ascending order from top to bottom,
     * write an efficient algorithm to search for a specific integer target in the
     * matrix.
     *
     * Examples:
     * Input: matrix = [ [1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22],
     * [10, 13, 14, 17, 24], [18, 21, 23, 26, 30] ], target = 5
     *
     * Output: True
     *
     * Explanation: The target 5 exists in the matrix in the index (1,1)
     *
     * Input: matrix= [ [1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22],
     * [10, 13, 14, 17, 24], [18, 21, 23, 26, 30] ], target = 20
     *
     * Output: False
     *
     * Explanation: The target 20 does not exist in the matrix.
     */
    public static boolean searchMatrixII(int[][] mat, int target) {

        int rows = mat.length;
        int cols = mat[0].length;

        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {

            if (mat[row][col] == target)
                return true;
            else if (mat[row][col] > target)
                col--;
            else
                row++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
        System.out.println("Searching the matrix with 5...");
        System.out.println(searchMatrixII(mat, 5)); // true

        System.out.println("Searching the matrix with 20...");
        System.out.println(searchMatrixII(mat, 20)); // false
    }
}
