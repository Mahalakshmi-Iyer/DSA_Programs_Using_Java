package Arrays;

import java.util.*;

public class SearchInPivotRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Enter the target to search : ");
        int target = sc.nextInt();

        int index = searchElement(numbers, target);
        if (index != -1) {
            System.out.println("Element found at the index : " + index);
        } else {
            System.out.println("Element not found!");
        }

        sc.close();
    }

    public static int searchElement(int numbers[], int target) {
        int minIdx = searchMin(numbers);

        if (target == numbers[minIdx]) {
            return minIdx;
        } else if (target <= numbers[numbers.length - 1]) {
            return binSearch(numbers, minIdx, numbers.length - 1, target);
        } else {
            return binSearch(numbers, 0, minIdx, target);
        }
    }

    public static int searchMin(int numbers[]) {
        int left = 0, right = numbers.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2);
            if (mid > 0 && numbers[mid - 1] > numbers[mid]) {
                return mid;
            } else if (numbers[left] < numbers[mid] && numbers[right] < numbers[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int binSearch(int numbers[], int left, int right, int target) {
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2);

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
