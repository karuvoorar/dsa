package recursion.challengers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MazeRowsCols {

    public static void main(String[] args) {
        // method 1
        int rows = 3;
        int cols = 3;
        System.out.println("Maze problem finding the path to reach goal..." + rows + " * " + cols);
        AtomicInteger count = new AtomicInteger(0);
        findPathCount(rows, cols, count);
        System.out.println(count.get());

        // method 2
        List<List<String>> paths = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        findPathsRowsCols(rows, cols, paths, ans);
        for (List<String> res : paths) {
            System.out.println(res);
        }

        // method 3
        List<String> res = new ArrayList<>();
        findPaths(rows, cols, res, "");
        for (String done : res) {
            System.out.println(done);
        }

    }

    private static void findPathCount(int rows, int cols, AtomicInteger count) {

        if (rows == 1 || cols == 1) {
            count.incrementAndGet();
            return;
        }

        findPathCount(rows - 1, cols, count); // decrement rows / move down
        findPathCount(rows, cols - 1, count); // decrement cols / move right
    }

    private static void findPathsRowsCols(int rows, int cols, List<List<String>> paths, List<String> ans) {

        if (rows == 1 && cols == 1) {
            paths.add(new ArrayList<>(ans));
            return;
        }

        if (rows != 1) {
            ans.add(rows + "," + cols);
            findPathsRowsCols(rows - 1, cols, paths, ans); // decrement rows / move down
            ans.remove(ans.size() - 1);
        }

        if (cols != 1) {
            ans.add(rows + "," + cols);
            findPathsRowsCols(rows, cols - 1, paths, ans); // decrement cols / move right
            ans.remove(ans.size() - 1);
        }

    }

    private static void findPaths(int rows, int cols, List<String> paths, String path) {

        if (rows == 1 && cols == 1) {
            paths.add(path);
            return;
        }

        if (rows != 1) {
            findPaths(rows - 1, cols, paths, path + "D"); // decrement rows / move down
        }

        if (cols != 1)
            findPaths(rows, cols - 1, paths, path + "R"); // decrement cols / move right

    }
}
