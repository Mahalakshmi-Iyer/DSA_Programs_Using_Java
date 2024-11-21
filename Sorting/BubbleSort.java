package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int numbers[] = { 9, 10, 1, 0, 3, 7, 4, 6 };
        bubbleSort(numbers);

        System.out.println("The sorted array is : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int temp;
        int swaps;
        for (int i = 0; i < n - 1; i++) {
            swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) // array is already sorted
                return;
        }
    }
}
