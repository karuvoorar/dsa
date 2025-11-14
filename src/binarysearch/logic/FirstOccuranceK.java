package binarysearch.logic;

public class FirstOccuranceK {

    public int firstOccuranceWithK(int[] nums, int target) {
        int ans = -1; // return -1 in case if nothing is found

        int low = 0;
        int high = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid] == target) {
                ans = mid;

                // Reduce the right side because the target needs to
                // be smallest index and see if we have correct an index
                high = mid-1;

            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
