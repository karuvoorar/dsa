package logic;

public class PatternPrint15 {
    /*
     * Given an integer n, you need to recreate the following reverse alphabet
     * pattern for any value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * ABCDE
     * ABCD
     * ABC
     * AB
     * A
     *
     * Example:
     * n = 5
     * Row 1 → A B C D E
     * Row 2 → A B C D
     * Row 3 → A B C
     * Row 4 → A B
     * Row 5 → A
     */

    public void pattern15(int n) {
        for (int i = n; i >= 1; i--) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
