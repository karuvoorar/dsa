package array.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionArray {

    public static void main(String[] args) {
        int[] num1 = new int[] { 3, 4, 6, 7, 9, 9 };
        int[] num2 = new int[] { 1, 5, 7, 8, 8 };
        int[] res = unionArray(num1, num2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n1Len = nums1.length;
        int n2Len = nums2.length;

        Set<Integer> integerSet = new TreeSet<>();

        for (int i = 0; i < n1Len; i++) {
            integerSet.add(nums1[i]);
        }

        for (int i = 0; i < n2Len; i++) {
            integerSet.add(nums2[i]);
        }

        int[] intArray = new int[integerSet.size()];

        int index = 0;
        for (Integer value : integerSet) {
            intArray[index++] = value;
        }

        return intArray;
    }
}
