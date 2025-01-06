package Backtracking;

public class NQueensBoolean {
    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        boolean ans = nQueens(board, 0);
        if (ans)
            System.out.println("\nThere exists atleast one solution for the " + n + "-Queens Problem");
        else
            System.out.println("\nNo solutions exist for the " + n + "-Queens Problem");
    }

    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return true;
        }
        // recursion step
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1))
                    return true;
                board[row][j] = '.';
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("\n------- Chess Board -------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // check 1 : vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        // check 2 : top left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // check 3 : top right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
