package logic;

public class PatternPrint6 {

    /*
     * Given an integer n.
     * You need to recreate the pattern given below for any value of N.
     * 
     * Let's say for N = 5, the pattern should look like as below:
     * 
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */
    public void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
