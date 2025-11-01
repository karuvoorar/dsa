package basic.string;

public class PalindromeCheck {

    /**
     * Given a string s, check whether it is a palindrome or not.
     * Return true if the string is a palindrome, otherwise return false.
     *
     * A string is called a palindrome if it reads the same forward and backward.
     *
     * Examples:
     * Input: s = "hannah"
     * Output: true
     * Explanation: The string "hannah" reads the same forward and backward, so it
     * is a palindrome.
     *
     * Input: s = "aabbaaa"
     * Output: false
     * Explanation: The string "aabbaaa" when reversed becomes "aaabbaa", which is
     * not the same.
     * Hence, it is not a palindrome.
     */

    public boolean palindromeCheck(String s) {
        char[] arr = s.toCharArray();

        int index = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (arr[i] != arr[index])
                return false;
            --index;
        }
        return true;
    }
}
