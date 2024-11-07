package Loops;

import java.util.*;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for prime : ");
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("It is neither prime nor composite");
        } else if (n == 2) {
            System.out.println("It is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println((isPrime == true) ? "It is prime" : "It is composite");
        }
    }
}
