package sorting;

public class BubbleSort {

    /*
     * Given an array of integers 'numberArray', the task is to sort it in
     * non-decreasing order using the Bubble Sort algorithm.
     *
     * Bubble Sort works by repeatedly finding the minimum element
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
     * - Sorts using adjacent swaps with sorting the largest at last first.
     * - Starts from lowest index, move adjacent checks with swaps.
     *
     */
    public int[] bubbleSort(int[] numbArr) {
        int index = numbArr.length - 1;

        while (index > 0) {
            for (int i = 0; i < index; i++) {
                if (numbArr[i] > numbArr[i + 1]) {
                    int temp = numbArr[i];
                    numbArr[i] = numbArr[i + 1];
                    numbArr[i + 1] = temp;
                }
            }
            --index;
        }

        return numbArr;
    }
}
