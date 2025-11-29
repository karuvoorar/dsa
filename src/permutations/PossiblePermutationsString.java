package permutations;

import java.util.ArrayList;
import java.util.List;

public class PossiblePermutationsString {

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

        possiblePermutations(str, result, "");

        return result;
    }

    private static void possiblePermutations(String str, List<String> result, String answer) {

        // base condition
        if (str.isEmpty()) {
            result.add(answer);
            return;
        }

        char c = str.charAt(0);

        for (int i = 0; i <= answer.length(); i++) {
            var j = answer.substring(0, i);
            var k = answer.substring(i);

            possiblePermutations(str.substring(1), result, j + c + k);
        }
    }
}
