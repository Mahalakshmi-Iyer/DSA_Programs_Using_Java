package BitManipulation;

import java.util.*;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count set bits : ");
        int n = sc.nextInt();

        int count = countSetBits(n);
        System.out.println("Count of set bits in " + n + " is " + count);
        sc.close();
    }

    public static int countSetBits(int n) {
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1)
                count++;
            n >>= 1;
        }

        return count;
    }
}
