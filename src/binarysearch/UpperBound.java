package binarysearch;

public class UpperBound {

    /**
     * Given a sorted array of integers nums and an integer x,
     * find the upper bound of x.
     *
     * The upper bound of x is defined as the smallest index i
     * such that nums[i] > x.
     *
     * If no such index exists (i.e., all elements are less than or equal to x),
     * return the size of the array.
     *
     * Examples:
     *
     * Input: n = 4, nums = [1,2,2,3], x = 2
     * Output: 3
     * Explanation:
     * Index 3 is the smallest index such that nums[3] > x.
     *
     * Input: n = 5, nums = [3,5,8,15,19], x = 9
     * Output: 3
     * Explanation:
     * Index 3 is the smallest index such that nums[3] > x.
     */
    public int upperBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length;

        // Binary search for the first index where nums[mid] > x
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= x) {
                // nums[mid] is less than or equal to x, move right
                left = mid + 1;
            } else {
                // nums[mid] > x, possible answer but check further left
                right = mid;
            }
        }

        // 'left' is now the upper bound index
        return left;
    }

}
