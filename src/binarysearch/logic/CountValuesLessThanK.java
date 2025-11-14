package binarysearch.logic;

public class CountValuesLessThanK {

    public static int countValuesLessThanK(int[] nums, int target) {
        int ans = nums.length; // if not found return length

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -10, -4, -2, 0, 1, 3, 6, 7, 9, 10 };

        System.out.println(countValuesLessThanK(arr, 9)); // 8
    }
}
