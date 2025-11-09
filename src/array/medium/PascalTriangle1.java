package array.medium;

public class PascalTriangle1 {

    /*
     * Given two integers r and c, return the value at the rth row and cth column
     * (1-indexed)
     * in Pascal's Triangle.
     *
     * Pascal's Triangle is defined as follows:
     *
     * 1. The first row contains a single element: 1.
     * 2. Each row has one more element than the previous row.
     * 3. Every row starts and ends with 1.
     * 4. For all interior elements (i.e., not at the ends),
     * the value at position (r, c) is computed as the sum of the two elements
     * directly above it from the previous row:
     *
     * Pascal[r][c] = Pascal[r−1][c−1] + Pascal[r−1][c]
     *
     * (Note: Indexing is 1-based)
     *
     * Example:
     * ---------
     * Input: r = 4, c = 2
     * Output: 3
     *
     * Explanation:
     * The Pascal's Triangle up to row 4 looks like this:
     *
     * Row 1: 1
     * Row 2: 1 1
     * Row 3: 1 2 1
     * Row 4: 1 3 3 1
     *
     * Therefore, value at row 4 and column 2 = 3
     */

    public int pascalTriangleI(int r, int c) {

        int[][] arr = new int[r][];

        for (int i = 0; i < r; i++) {

            arr[i] = new int[i + 3];

            for (int j = 1; j < arr[i].length; j++) {
                if (j >= arr[i].length - 1)
                    continue;

                // If row is 1 then start with 1
                if (i == 0) {
                    arr[i][j] = 1;
                    if (i == r - 1 && j == c)
                        return arr[i][j];
                    break;
                }

                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];

                if (i == r - 1 && j == c)
                    return arr[i][j];
            }
        }

        return -1;
    }
}
