package recursion.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        System.out.println("Generating Parenthesis...");
        generateParenthesis(2);
        generateParenthesis(5);

    }

    private static void generateParenthesis(int n) {
        var list = new ArrayList<String>();
        generateParenthesis(0, "", 0, 0, list, n);
        System.out.println(list);
    }

    private static void generateParenthesis(
            int index,
            String parenthesis,
            int open,
            int close,
            List<String> list,
            int n) {

        // base statement
        if (open >= 2 * n)
            return;

        if (open == close && (open + close) == (2 * n)) {
            list.add(parenthesis);
            return;
        }

        // Recurrence Solution
        generateParenthesis(index + 1, parenthesis + '(', open + 1, close, list, n);

        if (open > close) {
            generateParenthesis(index + 1, parenthesis + ')', open, close + 1, list, n);
        }
    }
}
