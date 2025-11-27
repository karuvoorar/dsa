package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class PhoneCharsCombinations {

    public static void main(String[] args) {
        System.out.println("Phone Characters Combinations..." + letterCombinations("34"));
        // System.out.println("Phone Characters Combinations..." +
        // letterCombinations("3497"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        // Digits represented in char array
        char[] chars = digits.toCharArray();

        // Array representing dial values
        String[] phoneDial = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        letterCombinations(phoneDial, chars, 0, ans, "");

        return ans;
    }

    private static void letterCombinations(String[] phoneDial, char[] digits, int index, List<String> ans, String res) {

        // base conditions
        if (index == digits.length) {
            ans.add(res);
            return;
        }

        // fetch the correct string
        char[] digitalChars = phoneDial[digits[index] - '0'].toCharArray();

        // for a dial number we add each and every char in loop
        for (char ch : digitalChars) {
            letterCombinations(phoneDial, digits, index + 1, ans, res + ch);
        }
    }
}
