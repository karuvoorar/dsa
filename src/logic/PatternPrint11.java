package logic;

public class PatternPrint11 {

    /*
     * Given an integer n.
     * You need to recreate the pattern given below for any value of N.
     * 
     * Let's say for N = 5, the pattern should look like as below:
     * 
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */
    public void pattern11(int n) {

        int value = 1;

        // outer loop, traversing
        for (int i = 1; i <= n; i++) {
            // set first value deciding what to start
            if (i % 2 == 0)
                value = 0;
            else
                value = 1;
            // travese inner loop to print values
            for (int j = 0; j < i; j++) {
                System.out.print(value);
                if (value == 1)
                    value = 0;
                else
                    value = 1;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
