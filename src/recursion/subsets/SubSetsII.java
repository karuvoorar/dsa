package recursion.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII {

    public static void main(String[] args) {
        System.out.println("Subset... " + subsetsWithDup(new int[] { 1, 2, 2 }));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        subsetsWithDup(nums, 0, ans, res);

        return res;
    }

    private static void subsetsWithDup(int[] nums, int index, List<Integer> ans, List<List<Integer>> res) {

        // base condition to terminate
        // since we traverse till the end
        if (index == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        // Pick the element
        ans.add(nums[index]);
        subsetsWithDup(nums, index + 1, ans, res);
        ans.remove(ans.size() - 1);

        // Skip the element
        // Skip the element if it has duplicates eliminate them
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                subsetsWithDup(nums, i, ans, res);
                return;
            }
        }

        subsetsWithDup(nums, nums.length, ans, res);
    }

}
