package recursion.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 2, 8, 5, 3, 9, 4, 1, 7 };

        System.out.println("Unsorted array..." + Arrays.toString(arr));

        selectionSort(arr, 0, 0, 0, arr.length);

        System.out.println("Sorted array..." + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int index, int currMin, int min, int length) {
        // base condition
        if (index == length - 1)
            return;

        if (arr[currMin] < arr[min])
            min = currMin;

        if (currMin == length - 1) {
            swap(arr, min, index);
            selectionSort(arr, index + 1, index + 1, index + 1, length);
            return;
        }

        selectionSort(arr, index, currMin + 1, min, length);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
