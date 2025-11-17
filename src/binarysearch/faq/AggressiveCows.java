package binarysearch.faq;

import java.util.Arrays;

public class AggressiveCows {

    /*
     * Given an array nums of size n, which denotes the positions of stalls, and an
     * integer k, which denotes the number of aggressive cows, assign stalls to k
     * cows such that the minimum distance between any two cows is the maximum
     * possible. Find the maximum possible minimum distance.
     *
     *
     * Examples:
     * Input: n = 6, k = 4, nums = [0, 3, 4, 7, 10, 9]
     *
     * Output: 3
     *
     * Explanation: The maximum possible minimum distance between any two cows will
     * be 3 when 4 cows are placed at positions [0, 3, 7, 10]. Here the distances
     * between cows are 3, 4, and 3 respectively. We cannot make the minimum
     * distance greater than 3 in any ways.
     */
    public int aggressiveCows(int[] nums, int k) {
    Arrays.sort(nums);

    int low = 1;
    int high = nums[nums.length - 1] - nums[0];
    int ans = 0; // 0 is safe if k==1 or no valid distances

    while (low <= high) {
      int mid = low + (high - low) / 2;

      int count = 1;               // place first cow at nums[0]
      int lastPlaced = nums[0];

      for (int i = 1; i < nums.length; i++) {
        if (nums[i] - lastPlaced >= mid) {
          lastPlaced = nums[i];
          count++;
          if (count == k) break;  // placed all cows
        }
      }

      if (count == k) {
        ans = mid;        // mid is possible, try larger
        low = mid + 1;
      } else {
        high = mid - 1;   // mid not possible, try smaller
      }
    }

    return ans;
  }
}
