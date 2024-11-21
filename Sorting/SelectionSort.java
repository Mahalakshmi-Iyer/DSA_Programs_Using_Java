package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int numbers[] = { 9, 10, 1, 0, 3, 7, 4, 6 };
        selectionSort(numbers);

        System.out.println("The sorted array is : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        int minPos;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
}
