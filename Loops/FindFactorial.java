package Loops;

import java.util.*;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial : ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Factorial of 0 is 1");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
