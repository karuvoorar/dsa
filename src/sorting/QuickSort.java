package sorting;

public class QuickSort {

    /*
     * Given an array of integers, nums, sort the array in non-decreasing order
     * using the quick sort algorithm. Return the sorted array.
     *
     * A sorted array in non-decreasing order is one in which each element is
     * either greater than or equal to all the elements to its left in the array.
     *
     * Examples:
     *
     * Input: nums = [7, 4, 1, 5, 3]
     * Output: [1, 3, 4, 5, 7]
     *
     * Explanation:
     * 1 <= 3 <= 4 <= 5 <= 7
     * Thus, the array is sorted in non-decreasing order.
     *
     * Input: nums = [5, 4, 4, 1, 1]
     * Output: [1, 1, 4, 4, 5]
     *
     * Explanation:
     * 1 <= 1 <= 4 <= 4 <= 5
     * Thus, the array is sorted in non-decreasing order.
     */
    public int[] quickSort(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    private int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int index = partition(nums, left, right);

            quickSort(nums, left, index - 1);
            quickSort(nums, index + 1, right);
        }
        return nums;
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left]; // get the first one as pivot
        int i = left;
        int j = right;

        while (i < j) {

            while (i <= right - 1 && nums[i] <= pivot)
                i++;

            while (j >= left + 1 && nums[j] > pivot)
                j--;

            // swap the numbers if the value is found
            if (i < j)
                swap(nums, i, j);
        }

        // swap the pivot to middle which is j
        swap(nums, left, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
