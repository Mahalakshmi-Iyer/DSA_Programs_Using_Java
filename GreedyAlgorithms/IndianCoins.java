package GreedyAlgorithms;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        // int amount = 590;
        int amount = 1059;
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins = 0;
        ArrayList<Integer> coinsUsed = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= amount) {
                countOfCoins++;
                coinsUsed.add(coins[i]);
                amount -= coins[i];
            }
        }

        System.out.println("Count of Minimum coins used : " + countOfCoins);
        System.out.println("Coins used are : ");
        for (int i = 0; i < coinsUsed.size(); i++) {
            System.out.print(coinsUsed.get(i) + " ");
        }
    }
}
