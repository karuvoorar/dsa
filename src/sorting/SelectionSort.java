package sorting;

public class SelectionSort {

    /*
     * Given an array of integers 'numberArray', the task is to sort it in
     * non-decreasing order using the Selection Sort algorithm.
     *
     * Selection Sort works by repeatedly finding the minimum element
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
     * - Sorts element in ascending order with starting the lowest number
     * - Sort each number one by one traverse loops
     * - Time Complexity is O(N^2) since we have 2 for loops
     * - Space Complexity is O(1) since we use the same array and there are only few
     * constant elements
     *
     */
    public int[] selectionSort(int[] numberArray) {

        for (int i = 0; i < numberArray.length; i++) {
            if (i == numberArray.length - 1)
                return numberArray;
            int value = numberArray[i];
            int index = i;
            for (int j = i + 1; j < numberArray.length; j++) {
                if (value > numberArray[j]) {
                    value = numberArray[j];
                    index = j;
                }
            }

            if (index != i) {
                int temp = numberArray[i];
                numberArray[i] = numberArray[index];
                numberArray[index] = temp;
            }
        }
        return numberArray;
    }
}
