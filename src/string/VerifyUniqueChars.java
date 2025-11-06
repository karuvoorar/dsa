package string;

public class VerifyUniqueChars {

    /**
     * Problem Statement:
     * -------------------
     * Given a string, determine whether it contains all unique characters or not.
     * If the string contains duplicate characters, print each duplicate character
     * along with the number of times it appears.
     * Otherwise, print that the string has no duplicates.
     *
     * Approach:
     * ----------
     * 1. Use an integer array of size 256 (to cover all ASCII characters) as a
     * frequency map.
     * 2. Traverse the input string and increment the count of each character in the
     * hash array.
     * 3. After counting, iterate through the hash array:
     * - If any character has a frequency > 1, print it as a duplicate.
     * 4. Finally, print the total number of duplicate characters found,
     * or indicate that the string has all unique characters.
     *
     * Time Complexity: O(n) — single pass to count + single pass to check
     * duplicates.
     * Space Complexity: O(1) — fixed-size array (256) independent of input length.
     *
     * Example:
     * ---------
     * Input: "apple"
     * Output:
     * char p has 2
     * apple has 1 are duplicates
     *
     * Input: "kite"
     * Output:
     * kite has No duplicates
     */
    public static void verifyUniqueChars(String str) {
        int[] hash = new int[256];
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            hash[chars[i]]++;
        }

        int count = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 1) {
                System.out.println("char " + (char) i + " has " + hash[i]);
                ++count;
            }
        }

        if (count > 0)
            System.out.println(str + " has " + count + " are duplicates");
        else
            System.out.println(str + " has No duplicates");
    }

    public static void main(String[] args) {
        verifyUniqueChars("bamboo");
        verifyUniqueChars("what");
    }
}
