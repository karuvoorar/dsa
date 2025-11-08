package array;

import java.util.Arrays;

public class PascalTriangle2 {

    /*
     * Given an integer r, return all the values in the rth row (1-indexed)
     * of Pascal's Triangle in the correct order.
     *
     * Pascal's Triangle rules:
     *
     * 1. The first row contains a single element: 1.
     *
     * 2. Each row has one more element than the previous row.
     * Example:
     * Row 1 → 1
     * Row 2 → 1 1
     * Row 3 → 1 2 1
     * Row 4 → 1 3 3 1
     * ...
     *
     * 3. Each value inside the triangle (not including the first and last values)
     * is the sum of the two values directly above it:
     * Pascal[r][c] = Pascal[r−1][c−1] + Pascal[r−1][c]
     *
     * Example:
     * --------
     * Input: r = 4
     * Output: [1, 3, 3, 1]
     *
     * Explanation:
     * The first four rows of Pascal's Triangle are:
     *
     * Row 1: 1
     * Row 2: 1 1
     * Row 3: 1 2 1
     * Row 4: 1 3 3 1
     *
     * Thus, the 4th row is [1, 3, 3, 1].
     */
    public int[] pascalTriangleII(int r) {

        int[][] arr = new int[r][];

        for (int i = 0; i < r; i++) {

            arr[i] = new int[i + 3];

            for (int j = 1; j < arr[i].length - 1; j++) {
                if (i == 0) {
                    arr[i][j] = 1;
                    break;
                }

                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }

            if (i == r - 1) {
                return Arrays.copyOfRange(arr[i], 1, arr[i].length - 1);
            }
        }

        return null;
    }
}
