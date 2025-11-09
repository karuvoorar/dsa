package array.easy;

public class TransposeMatrix {

    /**
     * Given a 2D integer matrix matrix, return the transpose of the matrix.
     * The transpose of a matrix is obtained by flipping it over its main diagonal —
     * meaning rows become columns, and columns become rows.
     *
     * The element at position (i, j) in the original matrix moves to position (j,
     * i) in the transposed matrix.
     */

    public static int[][] createArray(int rows, int columns) {
        int[][] result = new int[rows][columns];

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            sb.append("| ");
            for (int j = 0; j < columns; j++) {
                result[i][j] = counter++;
                sb.append(result[i][j] + " ");
            }
            sb.append("|\n");
        }
        System.out.println("\nCreated Array \n" + sb.toString() + "\n");

        return result;
    }

    public static void transposeMatrix(int[][] arr, int rows, int columns) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            sb.append("| ");
            for (int j = 0; j < rows; j++) {
                sb.append(arr[j][i] + " ");
            }
            sb.append("|\n");
        }

        System.out.println("\nResult Array \n" + sb.toString());
    }

    public static void main(String[] args) {
        transposeMatrix(createArray(3, 3), 3, 3);
    }
}
