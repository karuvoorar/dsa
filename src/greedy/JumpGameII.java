package greedy;

public class JumpGameII {

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 3, 1, 1, 4 };
        System.out.println("Result " + jumpGame(nums));
        nums = new int[] { 2, 2, 1, 1, 4 };
        System.out.println("Result " + jumpGame(nums));
    }

    public static int jumpGame(int[] nums) {

        int jumps = 0, currentEnd = 0, farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
