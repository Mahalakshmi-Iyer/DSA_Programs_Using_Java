package Arrays;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 1, 6, 9, 3 };
        System.out.println("Largest element in the array is " + findLargest(numbers));
        System.out.println("Smallest element in the array is " + findSmallest(numbers));
    }

    public static int findLargest(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findSmallest(int numbers[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}
