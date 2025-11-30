package recursion.challengers;

import java.util.ArrayList;
import java.util.List;

public class MazeObstacles {

    public static void main(String[] args) {

        boolean[][] matrix = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        System.out.println("Finding path for Matrix...");

        List<String> res = new ArrayList<>();

        findPaths(matrix, 0, 0, res, "");

        System.out.println(res);

    }

    private static void findPaths(boolean[][] matrix, int rows, int cols, List<String> res, String path) {

        // cut the recursion when path is blocked
        if (!matrix[rows][cols]) {
            return;
        }

        if (rows == matrix.length - 1 && cols == matrix[0].length - 1) {
            res.add(path);
            return;
        }

        if (rows < matrix.length - 1)
            findPaths(matrix, rows + 1, cols, res, path + "V");

        if (cols < matrix[0].length - 1)
            findPaths(matrix, rows, cols + 1, res, path + "H");
    }
}
