package basic.recursion;

public class ReverseArray {

    /**
     * Given an array nums of n integers, return reverse of the array.
     *
     * Examples:
     * Input : nums = [1, 2, 3, 4, 5]
     * Output : [5, 4, 3, 2, 1]
     *
     * Input : nums = [1, 3, 3, 3, 5]
     * Output : [5, 3, 3, 3, 1]
     */

    public int[] reverseArray(int[] nums) {
        return reverse(nums, 0, nums.length - 1);
    }

    public int[] reverse(int[] nums, int left, int right) {
        if (left == right || left > right)
            return nums;

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        return reverse(nums, left + 1, right - 1);
    }
}
