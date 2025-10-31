package logic;

public class PatternPrint10 {

    /*
     * Given an integer n.
     * You need to recreate the pattern given below for any value of N.
     * 
     * Let's say for N = 5, the pattern should look like as below:
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
     * 
     */
    public void pattern10(int n) {
        // outer loop traverse
        for (int i = 0; i < 2 * n - 1; i++) {
            int num = i + 1;
            if (i >= n)
                num = (2 * n) - i - 1;

            // print stars
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
