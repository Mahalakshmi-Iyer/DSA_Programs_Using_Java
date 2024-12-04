package Recursion;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial doesn't exist for negative numbers");
            sc.close();
            return;
        }

        int fact = findFactorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
        sc.close();
    }

    public static int findFactorial(int n) {
        if (n == 0)
            return 1;
        return n * findFactorial(n - 1);
    }
}