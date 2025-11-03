package basic.merge;

public class MergeNumbers {

    /**
     * Merges two sorted integer arrays (left and right) into a single sorted array.
     * This method assumes both input arrays are already sorted in non-decreasing
     * order.
     */
    public void merge(int[] left, int[] right) {
        int leftLen = left.length;
        int rightLen = right.length;

        // Result array to store merged output
        int[] result = new int[leftLen + rightLen];

        // Pointers to track current index of each array
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        // Compare elements from both arrays and insert the smaller one into result
        while (leftLen > leftIndex && rightLen > rightIndex) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                ++leftIndex; // Move to next element in left array
            } else {
                result[resultIndex] = right[rightIndex];
                ++rightIndex; // Move to next element in right array
            }
            ++resultIndex; // Move to next position in result array
        }

        // Copy any remaining elements from the left array (if any)
        while (leftIndex < leftLen) {
            result[resultIndex] = left[leftIndex];
            ++leftIndex;
            ++resultIndex;
        }

        // Copy any remaining elements from the right array (if any)
        while (rightIndex < rightLen) {
            result[resultIndex] = right[rightIndex];
            ++rightIndex;
            ++resultIndex;
        }

    }

}
