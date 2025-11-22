package basic.recursion;

public class CountSteps {

    public static void main(String[] args) {
        System.out.println(countSteps(8, 0));
    }

    private static int countSteps(int i, int c) {
        if (i == 0)
            return c;

        if (i % 2 == 0)
            return countSteps(i / 2, ++c);
        else
            return countSteps(i - 1, ++c);
    }
}
