package logic;

public class PatternPrint8 {

    /*
     * Given an integer n.
     * You need to recreate the pattern given below for any value of N.
     *
     * Let's say for N = 5, the pattern should look like as below:
     *********
     *******
     *****
     ***
     *
     *
     */
    public void pattern8(int n) {
        // loop each row with this outer loop
        for (int i = 0; i < n; i++) {
            // print spaces before printing
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print asterisk
            for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
