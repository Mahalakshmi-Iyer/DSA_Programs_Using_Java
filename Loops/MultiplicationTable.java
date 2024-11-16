package Loops;

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print its multiplication table: ");
        int n = sc.nextInt();

        System.out.println("Multiplication Table of " + n);
        System.out.println("--------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
