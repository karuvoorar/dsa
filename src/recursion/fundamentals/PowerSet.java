package recursion.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {

        System.out.println("Power Set..." + powerSet(new int[] { 1, 2, 3 }));
        System.out.println("Power Set..." + powerSet(new int[] { 1, 2 }));

    }

    public static List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        powerSet(nums, list, subList, 0, nums.length);
        return list;
    }

    private static void powerSet(int[] nums, List<List<Integer>> list, List<Integer> subList, int index, int length) {

        // if the index is length-1 of the arr then
        // no further combination can be formed
        if (index == length) {
            list.add(new ArrayList<>(subList));
            return;
        }

        // pick side
        subList.add(nums[index]); // Add index value
        powerSet(nums, list, subList, index + 1, length);
        subList.remove(subList.size() - 1); // remove last value added earlier

        // skip side
        powerSet(nums, list, subList, index + 1, length);
    }
}
