package array.medium;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subSet(arr));
    }

    private static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr) {
            int n = outer.size();
            for(int i=0; i<n; i++) {
                var inner = new ArrayList<Integer>();
                inner.addAll(outer.get(i)); // add the existing data for index
                inner.add(num); // add the number now
                outer.add(inner); // add to list
            }
        }

        return outer;
    }
}
