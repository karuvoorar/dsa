package binarysearch.matrix;

public class FindMax1 {

    /*
     * Given a non-empty grid mat consisting of only 0s and 1s, where all the rows
     * are sorted in ascending order, find the index of the row with the maximum
     * number of ones.
     *
     * If two rows have the same number of ones, consider the one with a smaller
     * index. If no 1 exists in the matrix, return -1.
     *
     *
     * Examples:
     * Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]
     *
     * Output: 0
     *
     * Explanation: The row with the maximum number of ones is 0 (0 - indexed).
     *
     * Input: mat = [ [0, 0], [0, 0] ]
     *
     * Output: -1
     *
     * Explanation: The matrix does not contain any 1. So, -1 is the answer.
     */
    public int rowWithMax1s(int[][] mat) {

    int ans = -1;
    int maxCount = 0;
    for (int i = 0; i < mat.length; i++) {
      int len = mat[i].length;
      int count = len - countOnes(mat[i]);

      if (count > maxCount) {
        ans = i;
        maxCount = count;
      }
    }
    return ans;
  }

  public int countOnes(int[] mat) {
    int low = 0, high = mat.length - 1;
    int ans = mat.length;
    while (low <= high) {
      int mid = (low + high) / 2;

      if (mat[mid] == 1) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }
}
