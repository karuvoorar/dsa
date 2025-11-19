package array.easy;

import java.util.Arrays;

public class SortTwoNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortTwoNumbers(new int[] { 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1 })));
    }

    private static int[] sortTwoNumbers(int[] is) {

        int low = 0, high = 0;

        while (high != is.length) {
            if (is[high] == 0) {
                swap(is, low, high);
                low++;
                high++;
            } else {
                high++;
            }
        }

        return is;
    }

    private static void swap(int[] is, int low, int high) {
        int temp = is[low];
        is[low] = is[high];
        is[high] = temp;
    }
}
