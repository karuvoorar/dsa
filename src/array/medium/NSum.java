package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NSum {

    // this is classic problem for 3sum or 4sum, but below code can be used to
    // determine for NSum
    // N can be substituted to any number greater then 1

    /*
     * Given an integer array nums and an integer target, return all unique
     * quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
     *
     * - a, b, c, d are distinct valid indices of nums.
     * - nums[a] + nums[b] + nums[c] + nums[d] == target.
     *
     * Each quadruplet should be unique (no duplicate combinations),
     * and the quadruplets can be returned in any order.
     *
     * ---
     *
     * Examples:
     *
     * Input:
     * nums = [1, -2, 3, 5, 7, 9], target = 7
     *
     * Output:
     * [[-2, 1, 3, 5]]
     *
     * Explanation:
     * nums[1] + nums[0] + nums[2] + nums[3] = 7
     *
     * ---
     *
     * Input:
     * nums = [7, -7, 1, 2, 14, 3], target = 9
     *
     * Output:
     * []
     *
     * Explanation:
     * No quadruplets are present which add up to 9
     *
     * ---
     *
     * Input:
     * nums = [1, 1, 3, 4, -3], target = 5
     *
     * Output:
     * [[-3, 1, 3, 4]]
     *
     * (Answer and each quadruplet must be sorted in ascending order)
     *
     * ---
     *
     * Constraints:
     * 1 <= nums.length <= 200
     * -10^4 <= nums[i] <= 10^4
     * -10^4 <= target <= 10^4
     */

    public List<List<Integer>> fourSum(int[] nums, int target) {
        // sort the array, to use 2-pointer technique
        Arrays.sort(nums);

        // use recursion to solve the rest.
        return fourSum(nums, 4, 0, target);
    }

    public List<List<Integer>> fourSum(int[] nums, int N, int start, int target) {
        // Result
        List<List<Integer>> res = new ArrayList<>();

        // Length of array
        int len = nums.length;

        // early termination
        if (N < 2 || start == len)
            return res;

        // Solving 2sum is easy when the array is sorted, we can use 2-pointer approach
        if (N == 2) {
            int left = start;
            int right = len - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                // If target reached, add those values
                if (sum == target) {
                    res.add(List.of(nums[left], nums[right]));
                    left++; // Increment left index
                    right--; // Decrement right index

                    // skip duplicates
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum > target)
                    right--; // if sum is greater, then reduce right index
                else if (sum < target)
                    left++; // if sum is less, then increase left index
            }
        } else {
            // Run one by one indexes
            for (int i = start; i < len; i++) {
                if (i > start && nums[i] == nums[i - 1])
                    continue;

                // Recursive handling
                for (List<Integer> subset : fourSum(nums, N - 1, i + 1, target - nums[i])) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.addAll(subset);
                    res.add(temp);
                }
            }
        }

        return res;
    }
}
