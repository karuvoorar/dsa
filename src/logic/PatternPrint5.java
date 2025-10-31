package logic;

public class PatternPrint5 {

    /*
     * Given an integer n.
     * You need to recreate the pattern given below for any value of N.
     * Let's say for N = 5, the pattern should look like as below:
     *****
     ****
     ***
     **
     *
     */

    public void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
