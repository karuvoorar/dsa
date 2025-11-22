package basic.recursion;

public class CountZeros {

    public static void main(String[] args) {
        System.out.println(countZero(1003005506));
    }

    private static int countZero(int i) {
        return countZero(i, 0);
    }

    private static int countZero(int i, int j) {
        if (i == 0)
            return j;

        if (i % 10 == 0)
            ++j;

        return countZero(i / 10, j);
    }

}
