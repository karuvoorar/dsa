package basic.recursion;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr1 = new int[] { 5, 6, 7, 8, 9, 1, 2, 4 };
        System.out.println("Finding element 2 in Array..." + rotatedSortedArray(arr1, 4));
    }

    private static int rotatedSortedArray(int[] arr, int target) {
        return rotatedSortedArray(arr, 0, arr.length - 1, target);
    }

    private static int rotatedSortedArray(int[] arr, int low, int high, int target) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[low] <= arr[mid]) {
            if (target >= arr[low] && target < arr[mid]) {
                return rotatedSortedArray(arr, low, mid - 1, target);
            } else {
                return rotatedSortedArray(arr, mid + 1, high, target);
            }
        }

        if (target >= arr[mid] && target <= arr[high]) {
            return rotatedSortedArray(arr, mid + 1, high, target);
        } else {
            return rotatedSortedArray(arr, low, mid - 1, target);
        }
    }

}
