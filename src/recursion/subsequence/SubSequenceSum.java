package recursion.subsequence;

public class SubSequenceSum {

    public static void main(String[] args) {

        boolean res1 = checkSubsequenceSum(new int[] { 1, 2, 3, 4, 5 }, 8);
        boolean res2 = checkSubsequenceSum(new int[] { 4, 3, 9, 2 }, 10);
        boolean res3 = checkSubsequenceSum(new int[] { 1, 10, 4, 5 }, 16);

        System.out.println("Result1 " + res1 + " Result2 " + res2 + " Result3 " + res3);

    }

    private static boolean checkSubsequenceSum(int[] nums, int k) {
        return checkSubsequenceSum(0, 0, nums, k);
    }

    private static boolean checkSubsequenceSum(int index, int sum, int[] nums, int target) {
        // if value found return true
        if (sum == target)
            return true;

        // if the index has reached end then move back
        if (index == nums.length)
            return false;

        // check if the sub seq is true
        if (checkSubsequenceSum(index + 1, sum + nums[index], nums, target)) {
            return true;
        }

        // if not then move further side
        return checkSubsequenceSum(index + 1, sum, nums, target);
    }
}
