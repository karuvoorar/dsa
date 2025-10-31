package logic;

public class PatternPrint2 {

    /*
     * Given an integer n, you need to recreate the pattern shown below for any
     * value of n.
     *
     * For example, when n = 5, the pattern should look like this:
     *
     * *
     * **
     * ***
     * ****
     * *****
     */

    class Solution {
        public void pattern2(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
