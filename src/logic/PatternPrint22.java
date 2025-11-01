package logic;

public class PatternPrint22 {

    /*
     * Given an integer n, you need to recreate the following concentric square
     * number pattern for any value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * 5 5 5 5 5 5 5 5 5
     * 5 4 4 4 4 4 4 4 5
     * 5 4 3 3 3 3 3 4 5
     * 5 4 3 2 2 2 3 4 5
     * 5 4 3 2 1 2 3 4 5
     * 5 4 3 2 2 2 3 4 5
     * 5 4 3 3 3 3 3 4 5
     * 5 4 4 4 4 4 4 4 5
     * 5 5 5 5 5 5 5 5 5
     *
     * Pattern rule:
     * - The pattern forms a square matrix of size (2 * n - 1) x (2 * n - 1).
     * - The outermost layer is filled with n, the next layer with (n - 1), and so
     * on.
     * - The center of the pattern contains the number 1.
     * - Each layer creates a concentric square of decreasing numbers as we move
     * inward.
     */
    public static void pattern22(int n) {

        // print 1 if n ==1
        if (n == 1) {
            System.out.print("1");
            System.out.println();
            return;
        }

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                System.out.print((n - Math.min(Math.min(top, bottom), Math.min(left, right))) + " ");
            }
            System.out.println();
        }
    }
}
