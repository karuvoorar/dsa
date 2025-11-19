package array.easy;

import java.util.Arrays;

public class ZeroToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 4, 0, 5, 2 };
        moveZeroLast(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroLast(int[] arr) {
        int start = 0, end = 0;

        while (end != arr.length) {
            if (arr[end] != 0) {
                swap(arr, start, end);
                start++;
                end++;
            } else {
                end++;
            }
        }
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
