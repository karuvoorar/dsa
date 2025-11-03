package sorting;

public class InsertionSort {

    /*
     * Given an array of integers 'numberArray', the task is to sort it in
     * non-decreasing order using the Insertion Sort algorithm.
     *
     * Insertion Sort works by repeatedly finding the minimum element
     * from the unsorted part of the array and swapping it with the
     * first element of the unsorted section.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * Example:
     * Input: numberArray = [7, 4, 1, 5, 3]
     * Output: [1, 3, 4, 5, 7]
     *
     * What it does?
     * - Assumes the array on left is sorted, traverses from the unsorted array
     * - Aim is to sort the array by ascending order, has to sort things in order
     * - e.g. it will pick a index value and sort in reverse if it's big and put
     * in its right place.
     *
     */
    public int[] insertionSort(int[] numbArr) {

        for (int i = 0; i < numbArr.length; i++) {
            int j = i;
            while (j > 0 && numbArr[j] < numbArr[j - 1]) {
                int temp = numbArr[j];
                numbArr[j] = numbArr[j + 1];
                numbArr[j + 1] = temp;
                --j;
            }
        }

        return numbArr;
    }
}
