package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class PhoneCharsCombinations {

    public static void main(String[] args) {
        System.out.println("Phone Characters Combinations..." + letterCombinations("34"));
        System.out.println("Phone Characters Combinations..." + letterCombinations("3497"));
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

    private static void letterCombinations(String[] phoneDial, char[] digits, int i, List<String> ans, String res) {

        // base conditions
        if (i == digits.length) {
            ans.add(new String(res));
            return;
        }

        // fetch the correct string
        int digit = digits[i] - '0';
        char[] digitalChars = phoneDial[digit].toCharArray();

        // for a dial number we add each and every char in loop
        for (int j = 0; j < digitalChars.length; j++) {
            res += digitalChars[j];
            letterCombinations(phoneDial, digits, i + 1, ans, res);
            res = (res == null || res.length() == 0) ? res : res.substring(0, res.length() - 1);
        }
    }
}
