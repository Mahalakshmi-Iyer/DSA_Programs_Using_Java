package Sorting;

public class CountingSort {
    public static void main(String[] args) {
        int numbers[] = { 9, 1, 1, 0, 3, 7, 4, 6 };
        countingSort(numbers);

        System.out.println("The sorted array is : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void countingSort(int arr[]) {
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
}
