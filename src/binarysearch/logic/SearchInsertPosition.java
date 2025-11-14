package binarysearch.logic;

public class SearchInsertPosition {

    /*
     * Given a sorted array of nums consisting of distinct integers and a target
     * value,
     * return the index if the target is found. If not, return the index where it
     * would
     * be if it were inserted in order.
     *
     * Examples:
     *
     * Input: nums = [1, 3, 5, 6], target = 5
     * Output: 2
     * Explanation:
     * The target value 5 is found at index 2 in the sorted array. Hence, the
     * function returns 2.
     *
     * Input: nums = [1, 3, 5, 6], target = 2
     * Output: 1
     * Explanation:
     * The target value 2 is not found in the array. However, it should be inserted
     * at
     * index 1 to maintain the sorted order of the array.
     */

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
