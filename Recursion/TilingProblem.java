package Recursion;

import java.util.*;

public class TilingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TILING PROBLEM : To tile floor of dimension 2 x n using tile of dimension 2 x 1");
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        int totalWays = tilingProblem(n);
        System.out.println("Number of ways in which tiles can be arranged is : " + totalWays);
        sc.close();
    }

    public static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1)
            return 1;

        int totalWays = tilingProblem(n - 1) + tilingProblem(n - 2); // vertical case + horizontal case
        return totalWays;
    }
}
