package array.medium;

public class TraverseMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println(traverseMatrix(matrix));
    }

    private static String traverseMatrix(int[][] matrix) {
        String ans = "";

        int rowsLen = matrix.length;
        int row = 0;

        for (int col = 0; col <= matrix[0].length; col++) {
            // base condition
            if (rowsLen == row)
                break;

            // reset col value and increment row
            if (col == matrix[0].length) {
                ++row;
                col = -1;
                continue;
            }

            ans += matrix[row][col];
            ans += " ";
        }

        return ans;
    }
}
