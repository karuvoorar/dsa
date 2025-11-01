package basic.string;

public class RotateString {

    /**
     * Given two strings s and goal, return true if and only if s can become goal
     * after some number of shifts on s.
     *
     * A shift on s consists of moving the leftmost character of s to the rightmost
     * position.
     *
     * Example:
     * Input: s = "abcde", goal = "cdeab"
     * Output: true
     * Explanation:
     * After performing 2 shifts, we can achieve the goal string from s.
     * After first shift: "bcdea"
     * After second shift: "cdeab"
     *
     * Input: s = "abcde", goal = "adeac"
     * Output: false
     * Explanation:
     * No number of shifts on s can make it equal to goal.
     */
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        if (s.equals(goal))
            return true;
        String align = s;
        for (int i = 0; i < s.length() - 1; i++) {
            align = align.substring(1) + align.substring(0, 1);
            if (align.equals(goal))
                return true;
        }
        return false;
    }
}
