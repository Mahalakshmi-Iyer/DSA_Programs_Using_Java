package Stacks;

import java.util.*;

public class MaxAreaInHistogram {
    public static void main(String[] args) {
        int ht[] = { 2, 1, 5, 6, 2, 3 }; // heights in histogram
        maxArea(ht);
    }

    public static void maxArea(int ht[]) {
        int maxArea = 0;
        int n = ht.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && ht[s.peek()] >= ht[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && ht[s.peek()] >= ht[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area = ht[i] * width = ht[i] * (nsr[i]-nsl[i]-1)
        for (int i = 0; i < n; i++) {
            int height = ht[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Maximum area in histogram : " + maxArea);
    }
}