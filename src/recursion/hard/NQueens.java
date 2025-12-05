package recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Solve N Queens with " + n);
        List<List<String>> res = solveNQueens(n);
        System.out.println(res);
    }

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> res = new ArrayList<>();

        boolean[][] matrix = new boolean[n][n];

        solveNQueens(matrix, 0, res);

        return res;
    }

    private static void solveNQueens(boolean[][] matrix, int row, List<List<String>> res) {

        // base condition
        if (row == matrix.length) {
            addSolution(matrix, res);
            return;
        }

        // recurrence relation
        // iterate every column for the row to see if this can be placed
        for (int col = 0; col < matrix.length; col++) {
            // check if the queen is safe to be placed
            if (isSafe(matrix, row, col)) {
                matrix[row][col] = true;
                solveNQueens(matrix, row + 1, res);
                matrix[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] matrix, int row, int col) {

        // check top
        if (row > 0) {
            for (int i = row; i >= 0; i--) {
                if (matrix[i][col])
                    return false;
            }
        }

        // check diagonal left
        if (col > 0) {
            for (int i = row, j = col; j >= 0 && i >= 0; i--, j--) {
                if (matrix[i][j])
                    return false;
            }
        }

        // check diagonal right
        if (col < matrix.length) {
            for (int i = row, j = col; i >= 0 && j < matrix.length; i--, j++) {
                if (matrix[i][j])
                    return false;
            }
        }

        return true;
    }

    private static void addSolution(boolean[][] matrix, List<List<String>> res) {

        List<String> sol = new ArrayList<>();

        for (boolean[] row : matrix) {
            String ans = "";
            for (boolean value : row) {
                if (value)
                    ans += "Q";
                else
                    ans += ".";
            }
            sol.add(ans);
        }

        res.add(sol);
    }

}
