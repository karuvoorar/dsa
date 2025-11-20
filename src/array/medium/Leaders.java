package array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders {

    /*
     * Given an integer array nums, return a list of all the leaders in the array.
     *
     *
     * A leader in an array is an element whose value is strictly greater than all
     * elements to its right in the given array. The rightmost element is always a
     * leader. The elements in the leader array must appear in the order they appear
     * in the nums array.
     *
     *
     * Examples:
     * Input: nums = [1, 2, 5, 3, 1, 2]
     *
     * Output: [5, 3, 2]
     *
     * Explanation:
     *
     * 2 is the rightmost element, 3 is the largest element in the index range [3,
     * 5], 5 is the largest element in the index range [2, 5]
     *
     * Input: nums = [-3, 4, 5, 1, -4, -5]
     *
     * Output: [5, 1, -4, -5]
     *
     * Explanation:
     *
     * -5 is the rightmost element, -4 is the largest element in the index range [4,
     * 5], 1 is the largest element in the index range [3, 5] and 5 is the largest
     * element in the range [2, 5]
     */
    public static List<Integer> leaders(int[] nums) {
        var list = new ArrayList<Integer>();

        int max = nums[nums.length - 1];
        list.add(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (max < nums[i]) {
                list.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Leaders in an Array");
        System.out.println(leaders(new int[] { 1, 2, 5, 3, 1, 2 }));
        System.out.println(leaders(new int[] { -3, 4, 5, 1, -4, -5 }));
    }
}
