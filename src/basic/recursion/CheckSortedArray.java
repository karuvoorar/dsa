package basic.recursion;

import java.util.ArrayList;

public class CheckSortedArray {

    /**
     * Given an array nums of n integers, return true if the array nums is sorted
     * in non-decreasing order or else false.
     *
     * Examples:
     * Input : nums = [1, 2, 3, 4, 5]
     * Output : true
     * Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1],
     * hence it is sorted and we return true.
     *
     * Input : nums = [1, 2, 1, 4, 5]
     * Output : false
     * Explanation : For i == 2 it does not hold nums[i] <= nums[i+1],
     * hence it is not sorted and we return false.
     */

    public boolean isSorted(ArrayList<Integer> nums) {
        if (nums.size() == 0)
            return false;
        if (nums.size() == 1)
            return true;
        return isSorted(nums, nums.size() - 1);
    }

    public boolean isSorted(ArrayList<Integer> nums, int index) {
        if (index == 0)
            return true;

        if (nums.get(index) < nums.get(index - 1))
            return false;

        return isSorted(nums, index - 1);
    }
}
