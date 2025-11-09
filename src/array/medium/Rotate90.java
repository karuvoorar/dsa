package array.medium;

public class Rotate90 {

    /*
     * Given an N x N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
     *
     * The rotation must be done **in place**, meaning the input 2D matrix should be
     * modified directly
     * (without using any additional 2D array).
     *
     * ---
     *
     * Example:
     *
     * Input:
     * matrix = [
     * [1, 2, 3],
     * [4, 5, 6],
     * [7, 8, 9]
     * ]
     *
     * Output:
     * matrix = [
     * [7, 4, 1],
     * [8, 5, 2],
     * [9, 6, 3]
     * ]
     */

    public void rotateMatrix(int[][] matrix) {

        // transpose matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // switch the columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
