package greedy;

import java.util.Arrays;

public class CanJumpIndex {

    public static void main(String[] args) {
        int[] eg1 = { 2, 3, 1, 0, 4 };
        int res1 = canJumpIndex(eg1);
        printResult(res1, eg1);

        int[] eg2 = { 3, 2, 1, 0, 4 };
        int res2 = canJumpIndex(eg2);
        printResult(res2, eg2);

        int[] eg3 = { 1, 2, 7, 0, 1, 4, 6, 5, 0, 3, 1, 1, 5, 1, 6, 8, 6, 6, 7, 7, 9, 4, 2, 6, 5, 0, 2, 6, 5, 5, 8, 4, 7, 0, 3, 0, 6, 5, 8, 9, 3, 7, 9, 4, 9, 1, 8, 3, 5, 1, 9, 4, 4, 9, 2, 0, 7, 0, 8, 3, 8, 5, 9, 2, 9, 0, 7, 0, 5, 4, 4, 1, 9, 7, 8, 3, 0, 6, 4, 7, 1, 3, 8, 1, 5, 5, 2, 8, 2, 6, 2 };
        int res3 = canJumpIndex(eg3);
        printResult(res3, eg3);
    }

    public static int canJumpIndex(int[] indexes) {

        // the farthest that we can make a jump
        int farthest = 0;

        for (int i = 0; i < indexes.length; i++) {

            if (i > farthest)
                break;

            farthest = Math.max(farthest, i + indexes[i]);
        }

        return farthest;

    }

    private static void printResult(int result, int[] arr) {
        if (result >= arr.length - 1) {
            System.out.println("We can make the Jump with " + Arrays.toString(arr));
        } else {
            System.out.println(
                    "We can NOT make the Jump with " + Arrays.toString(arr) + " We can jump only till " + result);
        }
    }
}
