package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        int length = 1 << nums.length;

        for (int num = 0; num < length; num++) {

            List<Integer> result = new ArrayList<>();

            for (int index = 0; index < nums.length; index++) {

                if ((num & (1 << index)) != 0)
                    result.add(nums[index]);

            }

            answer.add(result);
        }

        return answer;
    }
}
