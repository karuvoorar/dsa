package binarysearch.logic;

public class SearchRotated1 {

    /*
     * Given an integer array nums, sorted in ascending order (with distinct values)
     * and a target value k. The array is rotated at some pivot point that is
     * unknown. Find the index at which k is present and if k is not present return
     * -1.
     *
     *
     * Examples:
     * Input : nums = [4, 5, 6, 7, 0, 1, 2], k = 0
     *
     * Output: 4
     *
     * Explanation: Here, the target is 0. We can see that 0 is present in the given
     * rotated sorted array, nums. Thus, we get output as 4, which is the index at
     * which 0 is present in the array.
     */
    public int search(int[] nums, int k) {
        // return -1 if the element is not found
        int ans = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == k) {
                ans = mid;
                break;
            }

            // find if the left is sorted
            if (nums[low] <= nums[mid]) {

                // find the target fits within range
                if (k >= nums[low] && k < nums[mid]) {
                    high = mid - 1;
                }

                // if the target doesn't fit move to right side
                else {
                    low = mid + 1;
                }
            }

            // find if the right is sorted
            else {

                // find if the target fits within range
                if (k > nums[mid] && k <= nums[high]) {
                    low = mid + 1;
                }

                // if the target doesn't fit move to left side
                else {
                    high = mid - 1;
                }
            }
        }

        return ans;
    }
}
