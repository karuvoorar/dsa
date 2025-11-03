package basic.recursion;

public class Palindrome {

    /**
     * Given a string s, return true if the string is palindrome, otherwise false.
     *
     * A string is called palindrome if it reads the same forward and backward.
     *
     * Examples:
     * Input : s = "hannah"
     * Output : true
     * Explanation : The string when reversed is --> "hannah",
     * which is same as original string , so we return true.
     *
     * Input : s = "aabbaaa"
     * Output : false
     * Explanation : The string when reversed is --> "aaabbaa",
     * which is not same as original string, so we return false.
     */

    public boolean palindromeCheck(String s) {
        String reversed = palindrome(s, "", s.length() - 1);
        if (s.equals(reversed))
            return true;
        return false;
    }

    public String palindrome(String str, String result, int index) {
        if (str.length() < 2)
            return str;
        if (index == -1)
            return result;
        return palindrome(str, result + str.charAt(index), index - 1);
    }
}
