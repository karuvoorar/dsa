package logic;

public class PatternPrint18 {

    /*
     * Given an integer n, you need to recreate the following reverse alphabet
     * triangle pattern for any value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * E
     * D E
     * C D E
     * B C D E
     * A B C D E
     *
     * Example:
     * n = 5
     * Row 1 → E
     * Row 2 → D E
     * Row 3 → C D E
     * Row 4 → B C D E
     * Row 5 → A B C D E
     */

    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char value = (char) ('A' + (n - (i + 1)));
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                ++value;
            }
            System.out.println();
        }
    }

}
