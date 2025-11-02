package basic.string;

public class LargestOddNumber {

    /**
     * Given a string s representing a large integer, return the largest-valued odd
     * integer
     * (as a string) that is a substring of s.
     *
     * The returned number should not contain leading zeros,
     * although the input string may have them.
     * If no odd number exists, return an empty string.
     *
     * Examples:
     * Input: s = "5347"
     * Output: "5347"
     * Explanation: The odd numbers formed are 5, 3, 53, 347, 5347.
     * The largest odd number is 5347.
     *
     * Input: s = "0214638"
     * Output: "21463"
     * Explanation: The odd numbers formed are 1, 3, 21, 63, 463, 1463, 21463.
     * "021463" is invalid due to a leading zero.
     * Hence, the largest odd number is 21463.
     */

    public String largeOddNum(String s) {
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) {
                // find if there is a prefix with 0
                for (int j = 0; j <= i; j++) {
                    if (s.charAt(j) != '0') {
                        return s.substring(j, i + 1);
                    }
                }
                return "";
            }
        }
        return "";
    }
}
