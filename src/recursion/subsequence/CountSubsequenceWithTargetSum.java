package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequenceWithTargetSum {

    public static void main(String[] args) {
        int res1 = countSubsequenceWithTargetSum(new int[] { 4, 9, 2, 5, 1 }, 10);
        int res2 = countSubsequenceWithTargetSum(new int[] { 4, 2, 10, 5, 1, 3 }, 5);
        int res3 = countSubsequenceWithTargetSum(new int[] { 1, 10, 4, 5 }, 16);

        System.out.println("Result1 " + res1 + " Result2 " + res2 + " Result3 " + res3);
    }

    private static int countSubsequenceWithTargetSum(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        countSubsequenceWithTargetSum(nums, k, 0, list, subList, 0);

        return list.size();
    }

    private static void countSubsequenceWithTargetSum(
            int[] nums,
            int target,
            int index,
            List<List<Integer>> list,
            List<Integer> subList,
            int sum) {

        // if sum is achieved then the numbers are added to list
        if (sum == target) {
            list.add(subList);
            return;
        }

        // if nothing found for the target or sum is greater than target end recurrence
        if (index == nums.length || sum > target)
            return;

        // Pick
        subList.add(nums[index]);
        countSubsequenceWithTargetSum(nums, target, index + 1, list, subList, sum + nums[index]);
        subList.removeLast();

        // Skip
        countSubsequenceWithTargetSum(nums, target, index + 1, list, subList, sum);
    }

}
