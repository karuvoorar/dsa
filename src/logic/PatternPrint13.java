package logic;

public class PatternPrint13 {

    /*
     * Given an integer n, you need to recreate the following number pyramid pattern
     * for any value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     *
     * Pattern rule:
     * - Start from number 1 and keep incrementing sequentially.
     * - For each row i (1..n):
     * - Print i numbers in that row, separated by spaces.
     * - Continue numbering from the last printed number.
     *
     * Example:
     * n = 5
     * Row 1 → 1
     * Row 2 → 2 3
     * Row 3 → 4 5 6
     * Row 4 → 7 8 9 10
     * Row 5 → 11 12 13 14 15
     */
    public void pattern13(int n) {
        int value = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(value + " ");
                ++value;
            }
            System.out.println();
        }

    }
}
