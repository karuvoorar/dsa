package greedy;

import java.util.Arrays;

public class Cookie {

    public int findMaximumCookieStudents(int[] student, int[] cookie) {

        Arrays.sort(student);
        Arrays.sort(cookie);

        int count = 0;

        int sLen = 0;
        int cLen = 0;

        while (sLen < student.length && cLen < cookie.length) {

            if (cookie[cLen] >= student[sLen]) {
                ++count;
                ++sLen;
            }

            ++cLen;
        }

        return count;
    }
}
