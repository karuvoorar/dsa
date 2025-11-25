package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    public static void main(String[] args) {
        System.out.println("Combination sum.... " + combinationSum3(3, 7));
        System.out.println("Combination sum.... " + combinationSum3(3, 9));
        System.out.println("Combination sum.... " + combinationSum3(2, 9));
        System.out.println("Combination sum.... " + combinationSum3(2, 15));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        combinationSum3(k, n, ans, res, 0, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

        return res;
    }

    private static void combinationSum3(
            int len,
            int target,
            List<Integer> ans,
            List<List<Integer>> res,
            int index,
            int[] nums) {

        // base conditions
        if (ans.size() > len || target < 0)
            return;

        if (target == 0 && ans.size() == len) {
            res.add(new ArrayList<>(ans));
            return;
        }

        if(index == nums.length) return;

        ans.add(nums[index]);
        combinationSum3(len, target - nums[index], ans, res, index + 1, nums);
        ans.remove(ans.size() - 1);

        combinationSum3(len, target, ans, res, index + 1, nums);
    }
}
