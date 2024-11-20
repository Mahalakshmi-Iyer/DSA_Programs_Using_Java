package Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int numbers[] = { 0, -2, 1, 4, 2, -1, -2, 0, -1, -1 };
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        results = threeSum(numbers);

        System.out.println("Triplets with sum = 0 : ");
        for (List<Integer> result : results) {
            System.out.println(result);
        }
    }

    public static List<List<Integer>> threeSum(int numbers[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(numbers);
        int j = 0, k = 0, sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i != 0 && numbers[i] == numbers[i - 1])
                continue;
            j = i + 1;
            k = numbers.length - 1;
            while (j < k) {
                sum = numbers[i] + numbers[j] + numbers[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(numbers[i]);
                    temp.add(numbers[j]);
                    temp.add(numbers[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while (j < k && numbers[j] == numbers[j - 1])
                        j++;
                    while (j < k && numbers[k] == numbers[k - 1])
                        k--;
                }
            }
        }
        return result;

    }
}
