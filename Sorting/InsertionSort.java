package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int numbers[] = { 9, 10, 1, 0, 3, 7, 4, 6 };
        insertionSort(numbers);

        System.out.println("The sorted array is : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        int prev, curr;
        for (int i = 1; i < n; i++) {
            prev = i - 1;
            curr = arr[i];
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
}
