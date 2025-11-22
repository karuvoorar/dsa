package basic.recursion;

import java.util.ArrayList;
import java.util.List;

public class ReturnList {

    public static void main(String[] args) {
        System.out.println("Checking if array is sorted..." + returnList(new int[] { 1, 2, 4, 4, 7, 4, 10 }, 4));
    }

    private static List<Integer> returnList(int[] is, int target) {
        return returnList(is, is.length - 1, new ArrayList<Integer>(), target);
    }

    private static List<Integer> returnList(int[] is, int length, List<Integer> arrayList, int target) {

        if (length == -1)
            return arrayList;

        if (is[length] == target)
            arrayList.add(length + 1);

        return returnList(is, length - 1, arrayList, target);

    }
}
