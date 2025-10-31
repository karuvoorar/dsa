package logic;

public class PatternPrint3 {

    /*
     * Given an integer n, you need to recreate the following pattern.
     *
     * For example, if n = 5, the pattern should look like this:
     *
     * 1
     * 12
     * 123
     * 1234
     * 12345
     *
     * Each line i (1 ≤ i ≤ n) contains the numbers from 1 up to i.
     */

    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
