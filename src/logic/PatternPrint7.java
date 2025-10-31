package logic;

public class PatternPrint7 {

    /*
     * Given an integer n.
     * You need to recreate the pattern given below for any value of N.
     *
     * Let's say for N = 5, the pattern should look like as below:
     *
     ***
     *****
     *******
     *********
     *
     */
    public void pattern7(int n) {
        // loop each row with this outer loop
        for (int i = 0; i < n; i++) {
            // print spaces before printing
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print asterisk
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
