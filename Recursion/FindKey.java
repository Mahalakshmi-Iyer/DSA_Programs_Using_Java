package Recursion;

import java.util.*;

public class FindKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        System.out.println("Enter the key to find : ");
        int key = sc.nextInt();

        System.out.println("Indices of occurence in array :");
        printIdx(arr, 0, key);
        sc.close();
    }

    public static void printIdx(int arr[], int n, int key) {
        if (n == arr.length)
            return;

        if (arr[n] == key)
            System.out.print(n + " ");
        printIdx(arr, n + 1, key);
    }
}
