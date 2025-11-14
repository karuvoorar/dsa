package binarysearch.logic;

public class FloorCeil {

    /*
     * Given a sorted array nums and an integer x, find the floor and ceil of x in
     * nums.
     *
     * - The floor of x is the largest element in the array that is <= x.
     * - The ceiling of x is the smallest element in the array that is >= x.
     * - If no floor or ceil exists, output -1.
     *
     * Examples:
     *
     * Input: nums = [3, 4, 4, 7, 8, 10], x = 5
     * Output: 4 7
     * Explanation:
     * The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.
     *
     * Input: nums = [3, 4, 4, 7, 8, 10], x = 8
     * Output: 8 8
     * Explanation:
     * The floor of 8 in the array is 8, and the ceiling of 8 in the array is also
     * 8.
     */

    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = -1;
        int ceil = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] <= x) {
                floor = nums[mid];
                left = mid + 1;
            }
            if (nums[mid] >= x) {
                ceil = nums[mid];
                right = mid - 1;
            }
        }

        return new int[] { floor, ceil };
    }
}
