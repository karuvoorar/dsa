package permutations;

import java.util.ArrayList;
import java.util.List;

public class PossiblePermutationsStringSwaps {

    public static void main(String[] args) {
        var str = "abc";
        System.out.println("Finding possible permutations for " + str);

        var res = possiblePermutations(str);

        for (String string : res) {
            System.out.println(string);
        }
    }

    private static List<String> possiblePermutations(String str) {
        var result = new ArrayList<String>();

        possiblePermutations(str.toCharArray(), result, 0);

        return result;
    }

    private static void possiblePermutations(char[] array, List<String> result, int index) {

        // base condition
        if (array.length == index) {
            result.add(new String(array));
            return;
        }

        for (int i = index; i < array.length; i++) {
            swap(array, index, i); // choose an index
            possiblePermutations(array, result, index + 1); // explore
            swap(array, index, i); // backtrack
        }
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
