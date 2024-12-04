package Recursion;

import java.util.*;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for finding sum from 1-n : ");
        int n = sc.nextInt();

        int sum = calcSum(n);
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
        sc.close();
    }

    public static int calcSum(int n) {
        if (n == 1)
            return 1;
        return n + calcSum(n - 1);
    }
}
