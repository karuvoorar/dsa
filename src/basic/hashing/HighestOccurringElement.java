package basic.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElement {

    /**
 * Given an array nums of n integers, find the most frequent element in it — 
 * the element that appears the maximum number of times.
 * If multiple elements appear the same maximum number of times, 
 * return the smallest among them.
 *
 * Note: Understanding of hashing concepts will help in solving this problem efficiently.
 *
 * Examples:
 * Input: nums = [1, 2, 2, 3, 3, 3]
 * Output: 3
 * Explanation: The number 3 appears 3 times, which is the highest frequency.
 *
 * Input: nums = [4, 4, 5, 5, 6]
 * Output: 4
 * Explanation: Both 4 and 5 appear twice, but 4 is smaller, so the answer is 4.
 */
public int mostFrequentElement(int[] nums) {
    int length = nums.length;

    int element = 0;
    int frequency = 0;

    Map<Integer, Integer> hashed = new HashMap<>();

    for (int i = 0; i < length; i++) {
      hashed.put(nums[i], hashed.getOrDefault(nums[i], 0) + 1);
    }

    for (Map.Entry<Integer, Integer> hash : hashed.entrySet()) {

      if (frequency == hash.getValue() && element > hash.getKey()) {
        element = hash.getKey();
        continue;
      }
      if (hash.getValue() > frequency) {
        frequency = hash.getValue();
        element = hash.getKey();
      }
    }

    return element;
  }

}
