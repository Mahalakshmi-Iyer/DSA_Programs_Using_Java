package Day4;

import java.util.*;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the term of fibonacci series you want : ");
        int n = sc.nextInt();

        if (n == 1 || n == 2) {
            System.out.println("Term " + n + " of the fibonacci series is " + (n - 1));
        } else {
            int first = 0;
            int second = 1;
            int third = 0;
            for (int i = 2; i < n; i++) {
                third = first + second;
                first = second;
                second = third;
            }
            System.out.println("Term " + n + " of the fibonacci series is " + third);
        }
    }
}
