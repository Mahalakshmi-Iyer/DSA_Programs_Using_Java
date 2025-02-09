package GreedyAlgorithms;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0;
        ArrayList<Integer> ansIdx = new ArrayList<>();

        // sort based on end time
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sort 2d array based on column at index 2
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // first activity is always taken
        maxAct = 1;
        ansIdx.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // select activity
                maxAct++;
                ansIdx.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum activities : " + maxAct);
        System.out.println("Activities chosen : ");
        for (int i = 0; i < ansIdx.size(); i++) {
            System.out.print("A" + ansIdx.get(i) + " ");
        }
        System.out.println();
    }
}