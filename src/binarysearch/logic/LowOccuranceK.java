package binarysearch.logic;

public class LowOccuranceK {

    public int lowOccuranceWithK(int[] nums, int target) {
        int ans = -1; // return -1 in case if nothing is found

        int low = 0;
        int high = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                ans = mid;

                // Reduce the left side because the target needs to
                // be highest index and see if we have the index
                low = mid + 1;

            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
