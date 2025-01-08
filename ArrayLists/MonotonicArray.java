package ArrayLists;

import java.util.*;

public class MonotonicArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(6, 5, 4, 4));
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(1, 3, 2));

        if (checkMonotonic(nums1))
            System.out.println(nums1 + " is a monotonic array");
        else
            System.out.println(nums1 + " is not a monotonic array");

        if (checkMonotonic(nums2))
            System.out.println(nums2 + " is a monotonic array");
        else
            System.out.println(nums2 + " is not a monotonic array");

        if (checkMonotonic(nums3))
            System.out.println(nums3 + " is a monotonic array");
        else
            System.out.println(nums3 + " is not a monotonic array");
    }

    public static boolean checkMonotonic(ArrayList<Integer> nums) {
        int n = nums.size();
        if (n < 2)
            return true;

        int direction = 0; // 0 for not known, 1 for ascending, -1 for descending

        for (int i = 1; i < n; i++) {
            if (nums.get(i - 1) < nums.get(i)) { // ascending
                if (direction == 0)
                    direction = 1;
                else if (direction == -1)
                    return false;
            } else if (nums.get(i - 1) > nums.get(i)) { // descending
                if (direction == 0)
                    direction = -1;
                else if (direction == 1)
                    return false;
            }
        }
        return true;
    }

    public boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1))
                inc = false;
            if (A.get(i) < A.get(i + 1))
                dec = false;
        }
        return inc || dec;
    }
}
