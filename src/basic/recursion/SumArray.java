package basic.recursion;

public class SumArray {

    /**
     * Given an array nums, find the sum of elements of array using recursion.
     *
     * Examples:
     * Input : nums = [1, 2, 3]
     * Output : 6
     * Explanation : The sum of elements of array is 1 + 2 + 3 => 6.
     *
     * Input : nums = [5, 8, 1]
     * Output : 14
     * Explanation : The sum of elements of array is 5 + 8 + 1 => 14.
     *
     * Input : nums = [12, 9, 17]
     * Output : 38
     */

    public int arraySum(int[] nums) {
        return sum(nums, nums.length - 1, 0);
    }

    public int sum(int[] nums, int len, int sum) {
        if (len == -1)
            return sum;
        return sum(nums, len - 1, sum + nums[len]);
    }
}
