package logic;

public class PatternPrint1 {

    /*
     * Given an integer N, you need to recreate the following pattern.
     *
     * Example:
     * For N = 5, the output should be:
     *   *****
     *   *****
     *   *****
     *   *****
     *   *****
     * Each line contains N asterisks, and there are N such lines in total.
     *
     * You need to print this pattern inside the provided function.
     */

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
