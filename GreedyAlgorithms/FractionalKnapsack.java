package GreedyAlgorithms;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int totalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity > weight[idx]) {
                totalVal += val[idx];
                capacity -= weight[idx];
            } else {
                totalVal += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }

        System.out.println("Total value is : " + totalVal);
    }
}
