package DivideAndConquer;

public class CountInversions {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 1, 3, 5 };
        int arr2[] = { 2, 3, 4, 5, 6 };
        int arr3[] = { 5, 5, 5 };
        int invCount;

        invCount = mergeSort(arr1, 0, arr1.length - 1);
        printArray(arr1);
        System.out.println("Inversion count of array 1 is : " + invCount);

        invCount = mergeSort(arr2, 0, arr2.length - 1);
        printArray(arr2);
        System.out.println("Inversion count of array 2 is : " + invCount);

        invCount = mergeSort(arr3, 0, arr3.length - 1);
        printArray(arr3);
        System.out.println("Inversion count of array 3 is : " + invCount);
    }

    public static int mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return 0;
        }

        int mid = si + ((ei - si) / 2);
        int leftInvCount = mergeSort(arr, si, mid); // left part of array
        int rightInvCount = mergeSort(arr, mid + 1, ei); // right part of array

        int currInvCount = merge(arr, si, ei, mid);

        return (leftInvCount + rightInvCount + currInvCount);
    }

    public static int merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array
        int invCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}