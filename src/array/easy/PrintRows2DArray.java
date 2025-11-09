package array.easy;

public class PrintRows2DArray {

    /**
     * Print 2d Matrix row wise
     *
     * @param rows size of rows
     * @param columns size of columns
     */
    public static void print2dArray(int rows, int columns) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append("| ");
            for (int j = 0; j < columns; j++) {
                sb.append(i + "_" + j +" ");
            }
            sb.append("|\n");
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        print2dArray(3, 4);
    }
}
