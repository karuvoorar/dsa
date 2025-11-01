package logic;

public class PatternPrint17 {

    /*
     * Given an integer n, you need to recreate the following pyramid alphabet
     * pattern for any value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * A
     * ABA
     * ABCBA
     * ABCDCBA
     * ABCDEDCBA
     *
     * Pattern rule:
     * - For each row i (1..n):
     * - Print (n - i) spaces before the characters to center the pyramid.
     * - Then print alphabets in increasing order from 'A' to the i-th character.
     * - After reaching the i-th character, print alphabets in decreasing order back
     * to 'A'.
     * 
     * Example:
     * n = 5
     * Row 1 → "    A"
     * Row 2 → "   ABA"
     * Row 3 → "  ABCBA"
     * Row 4 → " ABCDCBA"
     * Row 5 → "ABCDEDCBA"
     */
    public void pattern17(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            char value = 'A';
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print value
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(value);
                if (j >= i)
                    --value;
                else
                    ++value;

            }
            System.out.println();
        }
    }
}
