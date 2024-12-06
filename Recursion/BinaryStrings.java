package Recursion;

import java.util.*;

public class BinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        binaryStrings(n, 0, "");
        sc.close();
    }

    public static void binaryStrings(int n, int lastPos, String bin) {
        if (n == 0) {
            System.out.println(bin);
            return;
        }
        binaryStrings(n - 1, 0, bin + "0");
        if (lastPos == 0) {
            binaryStrings(n - 1, 1, bin + "1");
        }
    }
}
