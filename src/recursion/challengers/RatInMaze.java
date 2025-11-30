package recursion.challengers;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };

        List<String> res = findPath(grid);

        for (String string : res) {
            System.out.println(string);
        }
    }

    public static List<String> findPath(int[][] grid) {
        List<String> res = new ArrayList<>();

        findPath(grid, res, 0, 0, "");
        return res;
    }

    private static void findPath(int[][] grid, List<String> res, int rows, int cols, String ans) {

        // this means the way can't be explored
        if (grid[rows][cols] == 0) {
            return;
        }

        // base condition when answer is found
        if (rows == grid.length - 1 && cols == grid[0].length - 1) {
            res.add(ans);
            return;
        }

        // mark this grid for exploration
        grid[rows][cols] = 0;

        // Move down for exploration
        if (rows < grid.length - 1)
            findPath(grid, res, rows + 1, cols, ans + "D");

        // Move right for exploration
        if (cols < grid[0].length - 1)
            findPath(grid, res, rows, cols + 1, ans + "R");

        // Move up for exploration
        if (rows > 0)
            findPath(grid, res, rows - 1, cols, ans + "U");

        // Move left for exploration
        if (cols > 0)
            findPath(grid, res, rows, cols - 1, ans + "L");

        // unmark this exploration when done
        grid[rows][cols] = 1;

    }
}
