package recursion.challengers;

import java.util.ArrayList;
import java.util.List;

public class MazeDiagonal {

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;
        System.out.println("Maze problem finding the path to reach goal..." + rows + " * " + cols);

        List<List<String>> paths = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        findPathsRowsCols(rows, cols, paths, ans);
        for (List<String> res : paths) {
            System.out.println(res);
        }
    }

    private static void findPathsRowsCols(int rows, int cols, List<List<String>> paths, List<String> ans) {

        if (rows == 1 && cols == 1) {
            paths.add(new ArrayList<>(ans));
            return;
        }

        if (rows > 1) {
            ans.add("V");
            findPathsRowsCols(rows - 1, cols, paths, ans);
            ans.remove(ans.size() - 1);
        }

        if (cols > 1) {
            ans.add("H");
            findPathsRowsCols(rows, cols - 1, paths, ans);
            ans.remove(ans.size() - 1);
        }

        if (rows > 1 && cols > 1) {
            ans.add("D");
            findPathsRowsCols(rows - 1, cols - 1, paths, ans);
            ans.remove(ans.size() - 1);
        }

    }

}
