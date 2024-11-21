package Sorting;

public class SortInDescOrder {
    public static void main(String[] args) {
        int numbers[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        // bubbleSort(numbers);
        // selectionSort(numbers);
        // insertionSort(numbers);
        countingSort(numbers);

        System.out.println("Array sorted in descending order is : " + numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        int maxPos;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            maxPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxPos]) {
                    maxPos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;

        int prev, curr;
        for (int i = 1; i < n; i++) {
            prev = i - 1;
            curr = arr[i];
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
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
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
