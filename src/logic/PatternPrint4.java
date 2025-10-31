package logic;

public class PatternPrint4 {

    /*
     * Given an integer n, you need to recreate the following pattern.
     *
     * For example, if n = 5, the pattern should look like this:
     *
     * 1
     * 22
     * 333
     * 4444
     * 55555
     *
     * Each line i (1 ≤ i ≤ n) contains the digit i repeated i times.
     */

    public void pattern4(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
            }
            ++num;
            System.out.println();
        }
    }
}