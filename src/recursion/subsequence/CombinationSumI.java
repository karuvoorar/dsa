package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {

    public static void main(String[] args) {
        System.out.println("Combination Sum... " + combinationSum(new int[] { 2, 3, 5, 4 }, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        combinationSum(candidates, target, 0, target, ans, res);

        return res;
    }

    private static void combinationSum(
            int[] candidates,
            int target,
            int index,
            int sum,
            List<Integer> ans,
            List<List<Integer>> res) {

        // base conditions
        // if the sum is '0' then answer is found
        if (sum == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        // return if the index exceeds the given numbers
        if (index == candidates.length || sum < 0)
            return;

        // recurrence relation
        // Pick the number and not move
        // this means it provides a branch of possible duplicates
        ans.add(candidates[index]);
        combinationSum(candidates, target, index, sum - candidates[index], ans, res);
        ans.remove(ans.size() - 1);

        // Don't pick but move next index
        // this avoids a number and make recursion tree
        combinationSum(candidates, target, index + 1, sum, ans, res);
    }
}
