package Arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = { 2, 7, 39, 49, 72, 100 };
        System.out.println("Enter key to search in the array : ");
        int key = sc.nextInt();

        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found in the array");
        } else {
            System.out.println("Key found at index " + index);
        }

        sc.close();
    }

    public static int binarySearch(int numbers[], int key) {

        int start = 0, end = numbers.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
