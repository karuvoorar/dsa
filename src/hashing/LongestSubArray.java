package hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {

    /*
     * Given an array nums of size n and an integer k,
     * find the length of the longest sub-array that sums to k.
     * If no such sub-array exists, return 0.
     *
     * Examples:
     *
     * Input:
     * nums = [10, 5, 2, 7, 1, 9], k = 15
     *
     * Output:
     * 4
     *
     * Explanation:
     * The longest sub-array with a sum equal to 15 is [5, 2, 7, 1],
     * which has a length of 4. This sub-array starts at index 1 and ends at index
     * 4,
     * and the sum of its elements (5 + 2 + 7 + 1) equals 15.
     * Therefore, the length of this sub-array is 4.
     *
     *
     * Input:
     * nums = [-3, 2, 1], k = 6
     *
     * Output:
     * 0
     *
     * Explanation:
     * There is no sub-array in the array that sums to 6.
     * Therefore, the output is 0.
     *
     *
     * Input:
     * nums = [-1, 1, 1], k = 1
     *
     * Output:
     * 3
     */

    public int longestSubArray(int[] nums, int k) {

        int resLen = 0;
        int prefixSum = 0;

        Map<Integer, Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // calculate prefix sum value
            prefixSum += nums[i];

            // if the calculated element is the prefix sum
            // then check for length max
            if (prefixSum == k)
                resLen = Math.max(resLen, i + 1);

            int rem = prefixSum - k;

            // If the remaining value is found then it is a subarray
            // find the max of length
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                resLen = Math.max(resLen, len);
            }

            // update length if the sum is not found
            if (!preSumMap.containsKey(prefixSum)) {
                preSumMap.put(prefixSum, i);
            }
        }

        return resLen;
    }
}
