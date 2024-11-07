package NumberSeriesProblems;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to test for Armstrong Number : ");
        int n = sc.nextInt();

        boolean ans = isArmstrong(n);
        if (ans)
            System.out.println(n + " is an Armstrong Number");
        else
            System.out.println(n + " is not an Armstrong Number");
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0, rem = 0;
        int p = calcPow(n);

        while (temp != 0) {
            rem = temp % 10;
            sum += Math.pow(rem, p);
            temp /= 10;
        }

        return (sum == n);
    }

    public static int calcPow(int n) {
        int p = 0;
        while (n != 0) {
            p++;
            n /= 10;
        }
        return p;
    }
}