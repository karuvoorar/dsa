package basic.recursion;

public class CheckSorted {

    public static void main(String[] args) {
        System.out.println("Checking if array is sorted..." + checkSorted(new int[] { 1, 2, 4, 5, 7, 8, 10 }));
        System.out.println("Checking if array is sorted..." + checkSorted(new int[] { 1, 2, 9, 5, 7, 8, 10 }));
    }

    private static boolean checkSorted(int[] is) {
        return checkSorted(is, is.length - 2);
    }

    private static boolean checkSorted(int[] is, int i) {
        if (i == -1)
            return true;

        if (is[i] < is[i + 1])
            return checkSorted(is, i - 1);
        else
            return false;
    }
}
