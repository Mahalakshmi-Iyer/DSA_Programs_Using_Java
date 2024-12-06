package Recursion;

import java.util.*;

public class FriendsPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends in the party : ");
        int n = sc.nextInt();

        int ways = pairingWays(n);
        System.out.println("Number of ways in which friends can be grouped : " + ways);
        sc.close();
    }

    public static int pairingWays(int n) {
        if (n == 1 || n == 2)
            return n;
        return (pairingWays(n - 1) + ((n - 1) * pairingWays(n - 2)));
    }
}
