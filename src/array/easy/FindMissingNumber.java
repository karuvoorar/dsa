package array.easy;

public class FindMissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 3, 6, 4, 2, 5}));
    }

    public static int missingNumber(int[] nums) {
        int actualSum = 0;
        int currSum =0 ;

        for (int i = 0; i < nums.length; i++) {
            actualSum += i;
            currSum += nums[i];
        }

        return (actualSum + nums.length) - currSum;
    }

}
