package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraySum {

    /*
     * Problem: Subarray Sum Equals K
     *
     * Given an array of integers nums and an integer k,
     * return the total number of subarrays whose sum equals k.
     *
     * -------------------------------------------------
     * Example 1:
     * Input: nums = [1, 1, 1], k = 2
     * Output: 2
     *
     * Explanation:
     * In the given array [1, 1, 1], there are two subarrays that sum up to 2:
     * [1, 1] (from index 0 to 1)
     * [1, 1] (from index 1 to 2)
     * Hence, the output is 2.
     *
     * -------------------------------------------------
     * Example 2:
     * Input: nums = [1, 2, 3], k = 3
     * Output: 2
     *
     * Explanation:
     * In the given array [1, 2, 3], there are two subarrays that sum up to 3:
     * [1, 2] (from index 0 to 1)
     * [3] (at index 2)
     * Hence, the output is 2.
     *
     * -------------------------------------------------
     * Example 3:
     * Input: nums = [3, 1, 2, 4], k = 6
     * Output: 2
     *
     * Explanation:
     * In the given array [3, 1, 2, 4], there are two subarrays that sum up to 6:
     * [3, 1, 2] (from index 0 to 2)
     * [2, 4] (from index 2 to 3)
     * Hence, the output is 2.
     */
    public int subarraySum(int[] nums, int k) {

        int countSubarray = 0;
        int prefixSum = 0;

        Map<Integer, Integer> perfixSumToCount = new HashMap<>();

        perfixSumToCount.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            // Sum the number
            prefixSum += nums[i];

            // Fetch the remaining value
            int rem = prefixSum - k;

            // count the subarray if the diff of sum is present
            countSubarray += perfixSumToCount.getOrDefault(rem, 0);

            // put the prefixSum with count of 1 as occurance if nothing found
            perfixSumToCount.put(prefixSum, perfixSumToCount.getOrDefault(prefixSum, 0) + 1);
        }

        return countSubarray;
    }
}
