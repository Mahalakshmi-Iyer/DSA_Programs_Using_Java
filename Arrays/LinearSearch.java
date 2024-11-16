package Arrays;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 9, 7, 20, 100, 12 };

        System.out.println("Enter the key to search in the array : ");
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found in the array");
        } else {
            System.out.println("Key found at index " + index);
        }
        sc.close();
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
