package logic;

public class PatternPrint19 {

    /*
    * Given an integer n, you need to recreate the following symmetric star pattern (hourglass or butterfly shape) 
    * for any value of n.
    *
    * For example, when n = 5, the pattern should look like this:
    *
    * *        *
    * **      **
    * ***    ***
    * ****  ****
    * **********
    * ****  ****
    * ***    ***
    * **      **
    * *        *
    *
    */


    public void pattern19(int n) {

        // outer loop first half
        for (int i = 1; i <= n; i++) {
            int spaces = (2 * n) - (2 * i);
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // outer loop second half
        for (int i = 1; i < n; i++) {
            int spaces = 2 * i;

            // print stars
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
