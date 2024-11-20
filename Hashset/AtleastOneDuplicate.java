package Hashset;

import java.util.Scanner;

import java.util.*;

public class AtleastOneDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array : ");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean answer = containsDuplicate(numbers);
        System.out.println((answer) ? "It contains a duplicate" : "It doesn't contain a duplicate");
        sc.close();
    }

    public static boolean containsDuplicate(int numbers[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                return true;
            }
            set.add(numbers[i]);
        }
        return false;
    }
}
