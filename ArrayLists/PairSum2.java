package ArrayLists;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        // sorted and rotated list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        if (pairSum(list, target)) {
            System.out.println("A pair exists which gives the sum " + target);
        } else {
            System.out.println("No pair exists which gives the sum " + target);
        }
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        // find the point from where the array is not sorted
        int pivot = (n - 1);
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int lp = (pivot + 1) % n, rp = pivot;
        int sum = 0;

        while (lp != rp) {
            sum = list.get(lp) + list.get(rp);
            if (sum == target)
                return true;
            else if (sum < target)
                lp = (lp + 1) % n;
            else
                rp = (rp - 1 + n) % n;
        }
        return false;
    }
}
