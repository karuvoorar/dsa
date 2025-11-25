package recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetsI {

    public static void main(String[] args) {
        System.out.println("Subset... " + subsetSums(new int[] { 5, 2, 1 }));
    }

    public static List<Integer> subsetSums(int[] nums) {
        List<Integer> res = new ArrayList<>();

        subsetSums(nums, 0, 0, res);
        return res;
    }

    private static void subsetSums(int[] nums, int index, int sum, List<Integer> res) {
        // base conditions
        if (nums.length == index) {
            res.add(sum);
            return;
        }

        // pick
        subsetSums(nums, index + 1, sum + nums[index], res);

        // skip
        subsetSums(nums, index + 1, sum, res);
    }
}
