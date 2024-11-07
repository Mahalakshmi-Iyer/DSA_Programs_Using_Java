package Loops;

import java.util.*;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int evenSum = 0, oddSum = 0;
        boolean choice = true;
        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();

            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }

            System.out.println("Enter 1 if you want to continue and 0 to exit : ");
            choice = (sc.nextInt() == 0) ? false : true;
        } while (choice);

        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);
    }
}
