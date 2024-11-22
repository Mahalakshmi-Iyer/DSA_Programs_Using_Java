package TwoDArrays;

import java.util.*;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        System.out.println("Enter a key to search : ");
        int key = sc.nextInt();

        staircaseSearch(matrix, key);
        sc.close();
    }

    public static void staircaseSearch(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at index (" + row + "," + col + ")");
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
    }
}
