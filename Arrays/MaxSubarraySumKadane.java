package Arrays;

public class MaxSubarraySumKadane {
    public static void main(String[] args) {
        int numbers[] = { 1, 9, 0, -4, -7, 8, 7, -3 };
        int negative_numbers[] = { -5, -12, -2, -11, -7 };

        int maxSum = subarraySumKadane(numbers);
        System.out.println("Maximum subarray sum is : " + maxSum);

        maxSum = subarraySumKadane(negative_numbers);
        System.out.println("Maximum subarray sum of negative array is : " + maxSum);
    }

    public static int subarraySumKadane(int numbers[]) {
        int n = numbers.length;
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currSum += numbers[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}
