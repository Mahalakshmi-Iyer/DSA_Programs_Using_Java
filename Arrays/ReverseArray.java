package Arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter elements of the array to reverse : ");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        reverse(numbers);

        System.out.println("Reversed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        int temp = 0;

        while (first < last) {
            temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }
}
