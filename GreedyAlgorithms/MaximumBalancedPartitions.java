package GreedyAlgorithms;

import java.util.*;

public class MaximumBalancedPartitions {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        System.out.println("Maximum number of balanced partions : " + balancedPartitions(str));
    }

    public static int balancedPartitions(String str) {
        int n = str.length();
        int lcount = 0, rcount = 0;
        int ans = 0;
        int startIdx = 0;
        ArrayList<String> substr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'L') {
                lcount++;
            } else if (str.charAt(i) == 'R') {
                rcount++;
            }

            if (lcount == rcount) {
                ans++;
                substr.add(str.substring(startIdx, i + 1));
                startIdx = i + 1;
            }
        }

        System.out.println("Balanced Substrings are : ");
        for (int i = 0; i < substr.size(); i++) {
            System.out.print(substr.get(i) + " ");
        }
        System.out.println();

        return ans;
    }
}