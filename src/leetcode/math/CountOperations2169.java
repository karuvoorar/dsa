package leetcode.math;

public class CountOperations2169 {

    /*
     * You are given two non-negative integers num1 and num2.
     *
     * In one operation:
     * - If num1 >= num2, subtract num2 from num1.
     * - Otherwise, subtract num1 from num2.
     *
     * The goal is to count how many operations are required
     * until either num1 = 0 or num2 = 0.
     *
     * ---
     *
     * Example 1:
     * Input: num1 = 2, num2 = 3
     *
     * Step-by-step:
     * - Operation 1: num1 = 2, num2 = 3 → num1 < num2 → subtract num1 from num2 →
     * num2 = 3 - 2 = 1 → (num1 = 2, num2 = 1)
     * - Operation 2: num1 = 2, num2 = 1 → num1 > num2 → subtract num2 from num1 →
     * num1 = 2 - 1 = 1 → (num1 = 1, num2 = 1)
     * - Operation 3: num1 = 1, num2 = 1 → num1 == num2 → subtract num2 from num1 →
     * num1 = 1 - 1 = 0 → (num1 = 0, num2 = 1)
     *
     * Now num1 = 0 → stop.
     * Total operations = 3.
     *
     * Output: 3
     *
     * ---
     * Example 2:
     * Input: num1 = 10, num2 = 10
     *
     * Step-by-step:
     * - Operation 1: num1 = 10, num2 = 10 → num1 == num2 → subtract num2 from num1
     * → num1 = 10 - 10 = 0 → (num1 = 0, num2 = 10)
     *
     * Now num1 = 0 → stop.
     * Total operations = 1.
     *
     * Output: 1
     */

    public int countOperations(int num1, int num2) {
        int count = 0;

        if (num1 == 0 || num2 == 0)
            return 0;

        while (num1 != 0 || num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
                ++count;
            } else if (num1 < num2) {
                num2 = num2 - num1;
                ++count;
            } else {
                num1 = 0;
                num2 = 0;
                ++count;
            }
        }

        return count;

    }
}
