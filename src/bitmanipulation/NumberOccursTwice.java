package bitmanipulation;

public class NumberOccursTwice {


    public int numberOccursTwice(int[] nums) {
        int ones = 0, twos = 0;

        for (int i = 0; i < nums.length; i++) {

            ones = (ones ^ nums[i]) & ~twos;

            twos = (twos ^ nums[i]) & ~ones;
        }

        return twos;
    }
}
