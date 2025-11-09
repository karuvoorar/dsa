package array.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    /*
     * Given an M x N matrix, print the elements in a clockwise spiral manner.
     *
     * Return an array with the elements in the order of their appearance
     * when printed in a spiral manner.
     *
     * Examples:
     *
     * Input:
     * matrix = [
     * [1, 2, 3],
     * [4, 5, 6],
     * [7, 8, 9]
     * ]
     *
     * Output:
     * [1, 2, 3, 6, 9, 8, 7, 4, 5]
     *
     * Explanation:
     * The elements in spiral order are:
     * 1, 2, 3 → 6, 9 → 8, 7 → 4 → 5
     *
     * -------------------------------------------------
     *
     * Input:
     * matrix = [
     * [1, 2, 3, 4],
     * [5, 6, 7, 8]
     * ]
     *
     * Output:
     * [1, 2, 3, 4, 8, 7, 6, 5]
     *
     * Explanation:
     * The elements in spiral order are:
     * 1, 2, 3, 4 → 8 → 7, 6, 5
     *
     */

    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int totalValue = rows * columns;

        List<Integer> result = new ArrayList<>(totalValue);

        // boundaries
        int leftColumn = 0;
        int rightColumn = columns - 1;
        int topRow = 0;
        int bottomRow = rows - 1;

        int direction = 0; // towards 0=left, 1=down, 2=right, 3=top

        int count = 0;

        while (count < totalValue) {

            if (direction == 0) {
                // left to right
                for (int i = leftColumn; i <= rightColumn; i++) {
                    result.add(matrix[topRow][i]);
                    ++count;
                }
                // move pointer below
                ++topRow;
                direction = 1;
            } else if (direction == 1) {
                // top to bottom
                for (int i = topRow; i <= bottomRow; i++) {
                    result.add(matrix[i][rightColumn]);
                    ++count;
                }

                --rightColumn;
                direction = 2;
            } else if (direction == 2) {
                // right to left
                for (int i = rightColumn; i >= leftColumn; i--) {
                    result.add(matrix[bottomRow][i]);
                    ++count;
                }

                --bottomRow;
                direction = 3;
            } else if (direction == 3) {
                // down to top
                for (int i = bottomRow; i >= topRow; i--) {
                    result.add(matrix[i][leftColumn]);
                    ++count;
                }

                ++leftColumn;
                direction = 0;
            }
        }

        return result;
    }
}
