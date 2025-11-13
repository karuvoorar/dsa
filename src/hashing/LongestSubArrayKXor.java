package hashing;

import java.util.HashMap;

public class LongestSubArrayKXor {

    /*
     * Problem: Count Subarrays with Given XOR
     *
     * Given an array of integers nums and an integer k,
     * return the total number of subarrays whose XOR equals k.
     *
     * -------------------------------------------------
     * Example 1:
     * Input : nums = [4, 2, 2, 6, 4], k = 6
     * Output : 4
     *
     * Explanation:
     * The subarrays having XOR of their elements equal to 6 are:
     * [4, 2]
     * [4, 2, 2, 6, 4]
     * [2, 2, 6]
     * [6]
     *
     * -------------------------------------------------
     * Example 2:
     * Input : nums = [5, 6, 7, 8, 9], k = 5
     * Output : 2
     *
     * Explanation:
     * The subarrays having XOR of their elements equal to 5 are:
     * [5]
     * [5, 6, 7, 8, 9]
     *
     * -------------------------------------------------
     * Example 3:
     * Input : nums = [5, 2, 9], k = 7
     * Output : 1
     *
     * Explanation:
     * The subarray having XOR equal to 7 is:
     * [5, 2]
     */

    public int subarraysWithXorK(int[] nums, int k) {
        int count = 0;
        int xor = 0;

        var XORToCount = new HashMap<Integer, Integer>();
        XORToCount.put(0, 1);

        for (int num : nums) {

            // find XOR
            xor = xor ^ num;

            // check if the xor is in the start
            int rem = xor ^ k;

            // count the xor start
            count += XORToCount.getOrDefault(rem, 0);

            // put the xor in map
            XORToCount.put(xor, XORToCount.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
