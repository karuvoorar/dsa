package binarysearch.fundamentals;

public class LowerBound {

    /**
     * Given a sorted array of integers nums and an integer x,
     * find the lower bound of x.
     *
     * The lower bound algorithm finds the first (smallest) index
     * in a sorted array where the value at that index is greater
     * than or equal to a given key (x).
     *
     * If no such index exists (i.e., all elements are smaller than x),
     * return the size of the array.
     *
     * Examples:
     *
     * Input: nums = [1,2,2,3], x = 2
     * Output: 1
     * Explanation:
     * Index 1 is the smallest index such that nums[1] >= x.
     *
     * Input: nums = [3,5,8,15,19], x = 9
     * Output: 3
     * Explanation:
     * Index 3 is the smallest index such that nums[3] >= x.
     */

    public int lowerBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length;

        // Binary search for the first index where nums[mid] >= x
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < x) {
                // If nums[mid] is smaller, discard the left half
                left = mid + 1;
            } else {
                // nums[mid] >= x, possible answer but keep looking left
                right = mid;
            }
        }

        // 'left' is now the lower bound index
        return left;
    }

}
