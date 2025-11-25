package recursion.fundamentals;

public class SkipChars {

    public static void main(String[] args) {
        System.out.println(skipChars("baccad", 'a'));
        System.out.println(skipCharsAnsBody("baccad", 'a'));
    }

    // Answer in argument
    private static String skipChars(String string, char c) {
        return skipChars(string, c, 0, string.length(), "");
    }

    private static String skipChars(String str, char c, int index, int length, String ans) {
        if (index == length)
            return ans;

        if (str.charAt(index) != c)
            return skipChars(str, c, index + 1, length, ans + str.charAt(index));
        else
            return skipChars(str, c, index + 1, length, ans);
    }

    // Answer in body
    private static String skipCharsAnsBody(String string, char c) {
        return skipCharsAnsBody(string, c, 0, string.length());
    }

    private static String skipCharsAnsBody(String str, char c, int index, int length) {
        if (index == length)
            return "";

        if (str.charAt(index) != c)
            return str.charAt(index)  + skipCharsAnsBody(str, c, index + 1, length);
        else
            return skipCharsAnsBody(str, c, index + 1, length);
    }

}
