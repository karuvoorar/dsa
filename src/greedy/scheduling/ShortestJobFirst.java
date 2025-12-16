package greedy.scheduling;

import java.util.Arrays;

public class ShortestJobFirst {

    public long solve(int[] bt) {

        if (bt.length <= 1)
            return 0;

        int startTime = 0;
        int endTime = 0;

        Arrays.sort(bt);

        for (int i = 0; i < bt.length; i++) {

            startTime = +endTime;
            endTime += bt[i];

        }

        return startTime / bt.length;
    }
}
