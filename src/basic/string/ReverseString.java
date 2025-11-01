package basic.string;

import java.util.List;

public class ReverseString {

    /**
     * Given a string represented as an array of characters s, reverse the array in
     * place
     * using O(1) extra memory.
     *
     * Note: No need to return anything, modify the given array directly.
     *
     * Examples:
     * Input: s = ["h", "e", "l", "l", "o"]
     * Output: ["o", "l", "l", "e", "h"]
     * Explanation: The string "hello" becomes "olleh" after reversal.
     *
     * Input: s = ["b", "y", "e"]
     * Output: ["e", "y", "b"]
     * Explanation: The string "bye" becomes "eyb" after reversal.
     */

    public void reverseString(List<Character> s) {
        int index = s.size() - 1;
        for (int i = 0; i < s.size() / 2; i++) {
            char temp = s.get(i);
            s.set(i, s.get(index));
            s.set(index, temp);
            --index;
        }
    }
}
