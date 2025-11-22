package basic.recursion;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(palindrome(13422431));
    }

    private static boolean palindrome(int i) {
        return i == rev(i, 0);
    }

    private static int rev(int i, int r) {
        if(i == 0) return r;

        int d = i%10;
        r = (r*10) + d;
        return rev(i/10, r);
    }
}
