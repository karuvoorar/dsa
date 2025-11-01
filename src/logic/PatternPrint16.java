package logic;

public class PatternPrint16 {

    /*
     * Given an integer n, you need to recreate the following alphabet repetition
     * pattern for any value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * A
     * BB
     * CCC
     * DDDD
     * EEEEE
     *
     * Example:
     * n = 5
     * Row 1 → A
     * Row 2 → B B
     * Row 3 → C C C
     * Row 4 → D D D D
     * Row 5 → E E E E E
     */
    public void pattern16(int n) {
        char value = 'A';
        for (int i = 1; i <= n; i++) {
            for (char j = 1; j <= i; j++) {
                System.out.print(value);
            }
            ++value;
            System.out.println();
        }
    }
}
