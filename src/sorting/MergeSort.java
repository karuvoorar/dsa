package sorting;

import java.util.Arrays;

public class MergeSort {

    /*
     * Given an array of integers, nums, sort the array in non-decreasing order
     * using the merge sort algorithm. Return the sorted array.
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
    public int[] mergeSort(int[] nums) {
        // uses divide & conquer way to split the array and to its end with only one
        // element
        return mergeSort(nums, 0, nums.length);
    }

    private int[] mergeSort(int[] nums, int left, int right) {
        if (right - left == 1)
            return Arrays.copyOfRange(nums, left, right);

        int mid = (left + right) / 2;

        int[] leftArr = mergeSort(nums, left, mid);
        int[] rightArr = mergeSort(nums, mid, right);

        return merge(leftArr, rightArr);
    }

    private int[] merge(int[] leftArr, int[] rightArr) {
        int leftLen = leftArr.length;
        int rightLen = rightArr.length;
        int[] resultArray = new int[leftLen + rightLen];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < leftLen && rightIndex < rightLen) {
            if (leftArr[leftIndex] > rightArr[rightIndex])
                resultArray[resultIndex++] = rightArr[rightIndex++];
            else if (leftArr[leftIndex] < rightArr[rightIndex])
                resultArray[resultIndex++] = leftArr[leftIndex++];
            else if (leftArr[leftIndex] == rightArr[rightIndex]) {
                resultArray[resultIndex++] = rightArr[rightIndex++];
                resultArray[resultIndex++] = leftArr[leftIndex++];
            }
        }

        // Add leftovers from right
        while (leftIndex < leftLen)
            resultArray[resultIndex++] = leftArr[leftIndex++];

        // Add leftovers from right
        while (rightIndex < rightLen)
            resultArray[resultIndex++] = rightArr[rightIndex++];

        return resultArray;
    }

}
