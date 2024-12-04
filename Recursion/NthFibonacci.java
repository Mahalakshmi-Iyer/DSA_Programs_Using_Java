package Recursion;

import java.util.*;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n(starting from 0) to find the nth term of the Fibonacci series : ");
        int n = sc.nextInt();

        int ans = findNthTerm(n);
        System.out.println("The nth term of the Fibonacci series is " + ans);
        sc.close();
    }

    public static int findNthTerm(int n) {
        if (n == 0 || n == 1)
            return n;
        return (findNthTerm(n - 1) + findNthTerm(n - 2));
    }
}
