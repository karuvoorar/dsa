package greedy;

public class CalculateLemonadeProfit {

    public static int lemonadeChange(int[] bills) {

        int registry = 0;

        int five = 10;
        int ten = 10;
        int twenty = 10;

        for (int bill : bills) {

            if (bill == 5) {
                ++five;
            } else if (bill == 10) {
                ++ten;
                --five;
            } else if (bill == 20) {
                ++twenty;
                --ten;
                --five;
            }

            registry += 5;
        }

        return registry;
    }

    public static void main(String[] args) {
        int[] bills = new int[] { 5, 5, 10, 5, 20 };

        int earnedMoney = lemonadeChange(bills);

        System.out.println("Profit acquired is " + ((double) earnedMoney * 0.3 + "$"));
    }
}
