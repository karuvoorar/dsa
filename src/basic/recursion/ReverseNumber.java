package basic.recursion;

public class ReverseNumber {

    // 1342, 0
    // 134, 2
    // 13, 24
    // 1, 243
    // 0, 2431
    static int reverseNum(int n, int rev) {
        if (n == 0)
            return rev;

        int digit = n % 10;
        rev = (rev * 10) + digit;
        return reverseNum(n / 10, rev);
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(1342, 0));
    }
}
