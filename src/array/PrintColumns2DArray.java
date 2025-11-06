package array;

public class PrintColumns2DArray {

    /**
     * Print 2D array via column
     *
     * @param rows    size of rows
     * @param columns size of columns
     */
    public static String[][] createArray(int rows, int columns) {
        String[][] result = new String[rows][columns];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            sb.append("| ");
            for (int j = 0; j < columns; j++) {
                result[i][j] = ("row=" + i + "_column=" + j + " ");
                sb.append(result[i][j]);
            }
            sb.append("|\n");
        }
        System.out.println(sb.toString() + "\n");

        return result;
    }

    public static void print2dArray(String[][] arr) {
        int rows = arr.length; // row length
        int cols = arr[0].length;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cols; i++) {
            sb.append("| ");
            for (int j = 0; j < rows; j++) {
                sb.append(arr[j][i]);
            }
            sb.append("|\n");
        }

        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        print2dArray(createArray(3, 3));
    }
}
