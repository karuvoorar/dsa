package basic.string;

import java.util.Arrays;

public class Anagram {

    /**
     * Given two strings s and t, return true if t is an anagram of s, otherwise
     * return false.
     *
     * An anagram is a word or phrase formed by rearranging the letters of another
     * word or phrase,
     * using all the original letters exactly once.
     *
     * Examples:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * Explanation: The characters of s can be rearranged to form t, as both have
     * the same character frequencies.
     *
     * Input: s = "dog", t = "cat"
     * Output: false
     * Explanation: The characters of s cannot be rearranged to form t, as their
     * character frequencies differ.
     */
    public boolean anagramStrings(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length())
            return false;

        // Convert strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}
