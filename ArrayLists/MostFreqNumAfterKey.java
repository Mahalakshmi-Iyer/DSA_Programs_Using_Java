package ArrayLists;

import java.util.*;

public class MostFreqNumAfterKey {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 100, 200, 1, 100));
        int key1 = 1;
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 3));
        int key2 = 2;

        int ans1 = mostFreqNum(nums1, key1);
        int ans2 = mostFreqNum(nums2, key2);

        System.out.println("Most frequent number after " + key1 + " in " + nums1 + " is : " + ans1);
        System.out.println("Most frequent number after " + key2 + " in " + nums2 + " is : " + ans2);
    }

    public static int mostFreqNum(ArrayList<Integer> nums, int key) {
        HashMap<Integer, Integer> keyFreq = new HashMap<>();

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key)
                keyFreq.put(nums.get(i + 1), keyFreq.getOrDefault(nums.get(i + 1), 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int k : keyFreq.keySet()) {
            if (keyFreq.get(k) > max) {
                max = keyFreq.get(k);
                ans = k;
            }
        }
        return ans;
    }
}
