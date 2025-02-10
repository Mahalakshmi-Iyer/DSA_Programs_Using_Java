package GreedyAlgorithms;

import java.util.*;

public class JobSequencing {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<>();

        // create an array of job objects
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // sort jobs in descending order of profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int totalProfit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                time++;
                seq.add(curr.id);
                totalProfit += curr.profit;
            }
        }

        // print sequence of jobs
        System.out.println("Maximum number of jobs : " + seq.size());
        System.out.print("Job ids chosen : ");
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
        System.out.println("Total Profit : " + totalProfit);
    }
}