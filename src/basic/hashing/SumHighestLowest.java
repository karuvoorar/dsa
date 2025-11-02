package basic.hashing;

import java.util.HashMap;
import java.util.Map;

public class SumHighestLowest {

    /**
     * Given an array of n integers, find the sum of the frequencies of
     * the highest occurring number and the lowest occurring number.
     *
     * Examples:
     * Input: arr = [1, 2, 2, 3, 3, 3]
     * Output: 4
     * Explanation: The highest frequency is 3 (for element 3),
     * and the lowest frequency is 1 (for element 1). Sum = 3 + 1 = 4.
     *
     * Input: arr = [4, 4, 5, 5, 6]
     * Output: 3
     * Explanation: The highest frequency is 2 (for elements 4 and 5),
     * and the lowest frequency is 1 (for element 6). Sum = 2 + 1 = 3.
     */
    public int sumHighestAndLowestFrequency(int[] nums) {
        int length = nums.length;

        Map<Integer, Integer> hashed = new HashMap<>();

        int highest = 0;
        int lowest = 0;

        for (int i = 0; i < length; i++) {
            hashed.put(nums[i], hashed.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> hash : hashed.entrySet()) {
            int freq = hash.getValue();

            if (highest == 0 && lowest == 0) {
                highest = lowest = freq;
            } else if (highest < freq) {
                highest = freq;
            } else if (lowest > freq) {
                lowest = freq;
            }
        }
        return highest + lowest;
    }
}
