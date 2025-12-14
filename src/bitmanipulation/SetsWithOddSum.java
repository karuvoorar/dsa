package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class SetsWithOddSum {

    public List<List<Integer>> setsWithOddSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        setsWithOddSum(nums, 0, ans, res, 0);

        return ans;
    }

    private static void setsWithOddSum(
        int[] nums, int index,
        List<List<Integer>> ans,
        List<Integer> res,
        int sum) {

    if (index == nums.length) {
        if (!res.isEmpty() && (sum & 1) != 0) {
            ans.add(new ArrayList<>(res)); // FIX
        }
        return;
    }

    // pick
    res.add(nums[index]);
    setsWithOddSum(nums, index + 1, ans, res, sum + nums[index]);
    res.remove(res.size() - 1);

    // skip
    setsWithOddSum(nums, index + 1, ans, res, sum);
}

}
