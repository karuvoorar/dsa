package greedy;

import java.util.ArrayList;
import java.util.List;

public class ActivitySelection {

    public static void main(String[] args) {

        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        System.out.println(activitySelection(start, end));
    }

    private static List<List<Integer>> activitySelection(int[] start, int[] end) {

        List<List<Integer>> result = new ArrayList<>();

        int endTime = 0;

        int index = 0;

        while (index < start.length) {

            if (endTime < start[index]) {
                List<Integer> ans = new ArrayList<>();

                endTime = end[index];

                ans.add(start[index]);
                ans.add(end[index]);

                result.add(ans);
            }

            ++index;
        }

        return result;
    }
}
