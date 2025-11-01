package logic;

public class PatternPrint12 {

    /*
     * Given an integer n, recreate the following symmetric numeric pattern for any
     * value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * 1 1
     * 12 21
     * 123 321
     * 1234 4321
     * 1234554321
     */

    public void pattern12(int n) {
        // outer loop traversing
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            for (int j = n; j > 0; j--) {
                if (j <= i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}