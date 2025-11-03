package basic.recursion;

public class CheckPrime {

    /**
     * Given an integer num, return true if it is prime otherwise false.
     *
     * A prime number is a number that is divisible only by 1 and itself.
     *
     * Examples:
     * Input : num = 5
     * Output : true
     * Explanation : The factors of 5 are 1 and 5 only.
     * So it satisfies the prime number condition.
     *
     * Input : num = 15
     * Output : false
     * Explanation : The factors of 15 are 1, 3, 5, 15 only.
     * As the number has factors other than 1 and itself,
     * So it is not a prime number.
     */

    public boolean checkPrime(int num) {
        if (num < 2)
            return false;
        return prime(num, num / 2);
    }

    public boolean prime(int num, int d) {
        if (d == 1)
            return true;
        if (num % d == 0)
            return false;

        return prime(num, d - 1);
    }
}
