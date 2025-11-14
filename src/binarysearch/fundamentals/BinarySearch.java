package binarysearch.fundamentals;

public class BinarySearch {

    /**
     * Given a sorted array of integers nums with 0-based indexing,
     * find the index of a specified target integer.
     *
     * If the target is found in the array, return its index.
     * If the target is not found, return -1.
     *
     * Examples:
     *
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: The target integer 9 exists in nums and its index is 4.
     *
     * Input: nums = [-1,0,3,5,9,12], target = 2
     * Output: -1
     * Explanation: The target integer 2 does not exist in nums so return -1.
     */
    class Solution {
        public int search(int[] nums, int target) {
            return search(nums, 0, nums.length - 1, target);
        }

        private int search(int[] nums, int left, int right, int target) {
            if (left > right)
                return -1;

            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                return search(nums, mid + 1, right, target);
            else
                return search(nums, left, mid - 1, target);
        }
    }

}
