package ArrayLists;

import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        if (pairSum(list, target)) {
            System.out.println("A pair exists which gives the sum " + target);
        } else {
            System.out.println("No pair exists which gives the sum " + target);
        }
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size() - 1;
        int sum = 0;

        while (lp < rp) {
            sum = list.get(lp) + list.get(rp);
            if (sum == target)
                return true;
            else if (sum < target)
                lp++;
            else
                rp--;
        }
        return false;
    }
}
