package binarysearch.logic;

public class CountOccuranceOfK {

    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };

        System.out.println(countOccuranceOfK(arr, 3));
        System.out.println(countOccuranceOfK(arr, 1));
    }

    private static int countOccuranceOfK(int[] arr, int i) {
        int ans = 0;

        int first = firstOccurance(arr, i);

        if (first == -1)
            return ans;

        return (lastOccurance(arr, i) - first) + 1;
    }

    private static int lastOccurance(int[] nums, int i) {
        int ans = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == i) {
                ans = mid;
                low = mid + 1; // we want the biggest index
            } else if (nums[mid] > i) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static int firstOccurance(int[] nums, int i) {
        int ans = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == i) {
                ans = mid;
                high = mid - 1; // we want the smallest index
            } else if (nums[mid] > i) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
