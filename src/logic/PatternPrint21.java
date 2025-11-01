package logic;

public class PatternPrint21 {
    /*
    * Given an integer n, you need to recreate the following hollow square star pattern for any value of n.
    *
    * For example, when n = 5, the pattern should look like this:
    *
    * *****
    * *   *
    * *   *
    * *   *
    * *****
    *
    * Pattern rule:
    * - The first and last rows are completely filled with stars (*).
    * - The rows in between have stars only at the first and last positions,
    *   with spaces in between to form a hollow shape.
    */

    public void pattern21(int n) {

        // print 1
        if (n == 1) {
            System.out.print("*");
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }
            int spaces = n - 2;
            System.out.print("*");
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

}
