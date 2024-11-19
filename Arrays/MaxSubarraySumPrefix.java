package Arrays;

public class MaxSubarraySumPrefix {
    public static void main(String[] args) {
        int numbers[] = { -1, -2, 0, -7 };
        int maxSum = subarraySum(numbers);

        System.out.println("Maximum subarray sum is : " + maxSum);
    }

    public static int subarraySum(int numbers[]) {

        int n = numbers.length;
        int prefix[] = new int[n];

        prefix[0] = numbers[0];
        System.out.println("Prefix array : ");
        System.out.print(prefix[0] + " ");
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
            System.out.print(prefix[i] + " ");
        }
        System.out.println();

        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int start, end;
        for (int i = 0; i < n; i++) {
            start = i;
            for (int j = i; j < n; j++) {
                end = j;
                currSum = (i == 0) ? prefix[end] : (prefix[end] - prefix[start - 1]);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }
}