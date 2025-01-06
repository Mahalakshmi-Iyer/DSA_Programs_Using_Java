package Backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9 && col == 0)
            return true;
        // recursion step
        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol))
                    return true;
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // case 1 : check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit)
                return false;
        }
        // case 2 : check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit)
                return false;
        }
        // case 3 : 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        // above 2 lines are used to find which 3x3 grid the digit belongs to

        for (int i = sr; i < (sr + 3); i++) {
            for (int j = sc; j < (sc + 3); j++) {
                if (sudoku[i][j] == digit)
                    return false;
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((j % 3 != 2))
                    System.out.print(sudoku[i][j] + " | ");
                else
                    System.out.print(sudoku[i][j] + " ");

                if (j % 3 == 2)
                    System.out.print("   ");

            }
            System.out.println();
            if (i % 3 == 2 && i != 8)
                System.out.println("-----------------------------------");
        }
    }
}