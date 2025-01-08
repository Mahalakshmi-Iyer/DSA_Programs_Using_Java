package ArrayLists;

import java.util.*;

public class LonelyNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(10, 6, 5, 8));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 3, 3, 5));
        findLonely(nums1);
        findLonely(nums2);
    }

    public static void findLonely(ArrayList<Integer> nums) {
        int n = nums.size();
        ArrayList<Integer> ans = new ArrayList<>();
        if (n == 1)
            ans.add(nums.get(0));

        else {
            Collections.sort(nums);

            if (nums.get(1) - nums.get(0) > 1)
                ans.add(nums.get(0));

            for (int i = 1; i < n - 1; i++) {
                if ((nums.get(i) - nums.get(i - 1)) > 1 && (nums.get(i + 1) - nums.get(i)) > 1)
                    ans.add(nums.get(i));
            }

            if (nums.get(n - 1) - nums.get(n - 2) > 1)
                ans.add(nums.get(n - 1));
        }

        System.out.println("The list of lonely numbers is : " + ans);

    }
}
