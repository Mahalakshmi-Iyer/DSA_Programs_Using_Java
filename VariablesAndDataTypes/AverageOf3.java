package VariablesAndDataTypes;

import java.util.*;

public class AverageOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = (a + b + c);
        int avg = sum / 3;

        System.out.println("The average of " + a + "," + b + " and " + c + " is " + avg);
    }
}