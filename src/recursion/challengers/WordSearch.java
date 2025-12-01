package recursion.challengers;

public class WordSearch {

    public static void main(String[] args) {

        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCCED";

        System.out.println(exist(board, word));

    }

    public static boolean exist(char[][] board, String word) {

        char start = word.charAt(0);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == start) {
                    if (checkExist(board, word.toCharArray(), i, j, 0))
                        return true;
                }
            }
        }

        return false;
    }

    private static boolean checkExist(
            char[][] board,
            char[] wordArray,
            int row,
            int col,
            int index) {

        // if the index reaches length of the word then it
        // means we found a match
        if (index == wordArray.length)
            return true;

        // boundary + visited check
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length)
            return false;

        if (board[row][col] != wordArray[index])
            return false;

        char markedFor = board[row][col];
        board[row][col] = '#'; // mark that cell

        boolean res =
                // check down
                checkExist(board, wordArray, row + 1, col, index + 1) ||
                // check right
                checkExist(board, wordArray, row, col + 1, index + 1) ||
                // check top
                checkExist(board, wordArray, row - 1, col, index + 1) ||
                // check left
                checkExist(board, wordArray, row, col - 1, index + 1);

        board[row][col] = markedFor; // unmark that cell

        return res;

    }
}
