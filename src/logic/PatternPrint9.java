package logic;

public class PatternPrint9 {
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
     *********
     *******
     *****
     ***
     *
     * 
     */
    public void pattern9(int n) {
        // outer loop to print triangle
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // go next line
            System.out.println();
        }

        // outer loop to print inverted triangle
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // go next line
            System.out.println();
        }
    }
}
