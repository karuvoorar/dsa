package greedy;

import java.util.Arrays;

public class FindMaximumCookieStudent {

    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {

        if (Student.length == 0 || Cookie.length == 0)
            return 0;

        Arrays.sort(Student);
        Arrays.sort(Cookie);

        int ans = 0;

        int index = 0;

        while (index < Student.length && index < Cookie.length) {

            if (Student[index] <= Cookie[index]) {
                ++ans;
            }

            ++index;

        }

        return ans;
    }
}
