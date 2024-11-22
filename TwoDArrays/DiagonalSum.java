package TwoDArrays;

import java.util.*;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for n*n matrix : ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = diagonalSum(matrix, n);
        System.out.println("The diagonal sum for this matrix is : " + sum);
        sc.close();
    }

    public static int diagonalSum(int matrix[][], int n) {

        // BRUTE FORCE : TC - O(n^2)
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if ((i == j) || (i + j) == (n - 1)) {
        // sum += matrix[i][j];
        // }
        // }
        // }
        // return sum;

        // OPTIMAL SOLN : TC - O(n)
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            if (i != (n - 1 - i))
                sum += matrix[i][n - 1 - i];
        }
        return sum;
    }
}