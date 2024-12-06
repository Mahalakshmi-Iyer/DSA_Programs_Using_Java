package Recursion;

import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        towerOfHanoi(n, "A", "B", "C");
        sc.close();
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // base case
        if (n == 1) {
            System.out.println("Move Disc " + n + " from " + src + " to " + dest);
            return;
        }

        // step 1 : transfer n-1 discs from A to B using C
        towerOfHanoi(n - 1, src, dest, helper);

        // step 2 : transfer nth disc from A to C
        System.out.println("Move Disc " + n + " from " + src + " to " + dest);

        // step 3 : transfer n-1 discs from B to C using A
        towerOfHanoi(n - 1, helper, src, dest);
    }
}
