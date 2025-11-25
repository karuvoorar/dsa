package recursion.subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void main(String[] args) {
        System.out.println("Combination Sum... " + combinationSum2(new int[] { 2, 1, 2, 7, 6, 1, 5 }, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Sort the given array
        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        combinationSum2(candidates, 0, target, ans, res);

        return res;
    }

    private static void combinationSum2(
            int[] candidates,
            int index,
            int sum,
            List<Integer> ans,
            List<List<Integer>> res) {
        // if we are at the sum then return list
        if (sum == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        // if the sum is more than intended OR
        // if the index is length of the numbers then it's over
        if (sum < 0 || index == candidates.length)
            return;

        // Pick the element
        // add the element
        ans.add(candidates[index]);
        combinationSum2(candidates, index + 1, sum - candidates[index], ans, res);
        // backtrack
        ans.remove(ans.size() - 1);

        // skip element
        // this can be used to eliminate the duplicates
        for (int i = index + 1; i < candidates.length; i++) {
            if (candidates[i] != candidates[index]) {
                combinationSum2(candidates, i, sum, ans, res);
                break;
            }
        }
    }
}
