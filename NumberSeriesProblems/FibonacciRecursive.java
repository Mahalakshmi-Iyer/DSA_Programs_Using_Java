package NumberSeriesProblems;

import java.util.*;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term of the fibonacci series you want : ");
        int n = sc.nextInt();
        int ans = fib(n);

        System.out.println("Term " + n + " of the fibonacci series is " + ans);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2)
            return (n - 1);
        else {
            return (fib(n - 1) + fib(n - 2));
        }
    }
}
