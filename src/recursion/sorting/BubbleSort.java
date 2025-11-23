package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 2, 8, 5, 3, 9, 4, 1, 7 };

        System.out.println("Unsorted array..." + Arrays.toString(arr));

        bubbleSort(arr, 0, arr.length);

        System.out.println("Sorted array..." + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int start, int sorted) {
        // base condition
        if (sorted == 0)
            return;

        if (start == sorted - 1) {
            bubbleSort(arr, 0, sorted - 1);
            return;
        } else if (arr[start] > arr[start + 1]) {
            swap(arr, start, start + 1);
        }

        bubbleSort(arr, start + 1, sorted);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
