package basic.recursion;

import java.util.ArrayList;

public class ReverseString {

    /**
     * Given an input string as an array of characters, write a function that
     * reverses the string.
     *
     * Examples:
     * Input : s = ["h", "e", "l", "l", "o"]
     * Output : ["o", "l", "l", "e", "h"]
     * Explanation : The given string is s = "hello" and after reversing it becomes
     * s = "olleh".
     *
     * Input : s = ["b", "y", "e" ]
     * Output : ["e", "y", "b"]
     * Explanation : The given string is s = "bye" and after reversing it becomes s
     * = "eyb".
     *
     * Input : s = ["h", "a", "n", "n", "a", "h"]
     * Output : ["h", "a", "n", "n", "a", "h"]
     */

    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        return reverse(s, 0, s.size() - 1);
    }

    public ArrayList<Character> reverse(ArrayList<Character> s, int left, int right) {
        if (left == right || left > right)
            return s;

        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        return reverse(s, left + 1, right - 1);
    }
}
