package bitmanipulation;

public class SetBiCount {

    public int setBitCost(int n, int k) {

        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            ++count;
        }

        return count * k;
    }
}
