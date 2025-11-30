package recursion.challengers;

import java.util.ArrayList;
import java.util.List;

public class RollDice {

    public static void main(String[] args) {
        int goal = 4;
        System.out.println("Rolling Dice to find combinations to come to...." + goal);
        var res = rollDice(4);

        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> rollDice(int goal) {
        int[] dice = { 1, 2, 3, 4, 5, 6 };

        var res = new ArrayList<List<Integer>>();

        var ans = new ArrayList<Integer>();

        rollDice(goal, res, ans, dice);

        return res;
    }

    private static void rollDice(int goal, List<List<Integer>> res, List<Integer> ans, int[] dice) {

        // base condition
        if (goal < 0)
            return;

        if (goal == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        // Recurrence Relation
        for (int i = 0; i < dice.length; i++) {
            ans.add(dice[i]);
            rollDice(goal - dice[i], res, ans, dice);
            ans.remove(ans.size() - 1);
        }
    }
}
