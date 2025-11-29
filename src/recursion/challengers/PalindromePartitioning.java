package recursion.challengers;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        System.out.println("Palindrome Partitioning..." + partition("aabaa"));
        System.out.println("Palindrome Partitioning..." + partition("aaba"));
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();

        partition(s, ans, res, 0);

        return ans;
    }

    private static void partition(String str, List<List<String>> ans, List<String> res, int index) {

        // Base condition
        if (index == str.length()) {
            ans.add(new ArrayList<>(res));
            return;
        }

        // recurrence relation
        for (int i = index; i < str.length(); i++) {
            if (checkPalindrome(str, index, i)) {

                res.add(str.substring(index, i+1));

                partition(str, ans, res, i + 1);

                res.remove(res.size() - 1);
            }
        }
    }

    private static boolean checkPalindrome(String str, int start, int end) {

        while (start <= end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }

        return true;
    }
}
