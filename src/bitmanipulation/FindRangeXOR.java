package bitmanipulation;

public class FindRangeXOR {

    public int findRangeXOR(int l, int r) {
        
        int xor = 0;
        for (int i = l; i <= r; i++) {
            xor ^= i;
        }

        return xor;
    }
}
