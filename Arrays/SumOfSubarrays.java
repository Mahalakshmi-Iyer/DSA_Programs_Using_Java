package Arrays;

public class SumOfSubarrays {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        System.out.println("Subarrays and their corresponding sums are : \n");
        subarraySum(numbers);
    }

    public static void subarraySum(int numbers[]) {
        int sum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                System.out.println("\t\tSUM = " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("\nMaximum subarray sum = " + maxSum);
        System.out.println("Minimum subarray sum = " + minSum);
    }
}
