package logic;

public class PatternPrint14 {

    /*
     * Given an integer n, you need to recreate the following alphabet pattern for
     * any value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * A
     * AB
     * ABC
     * ABCD
     * ABCDE
     *
     * Pattern rule:
     * - For each row i (1..n):
     * - Print characters starting from 'A' up to the i-th letter.
     * - Each new row adds one more character sequentially.
     *
     * Example:
     * n = 5
     * Row 1 → A
     * Row 2 → A B
     * Row 3 → A B C
     * Row 4 → A B C D
     * Row 5 → A B C D E
     */

    public void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
