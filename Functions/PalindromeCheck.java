package Functions;

import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for palindrome : ");
        int n = sc.nextInt();

        int rev = findReverse(n);
        System.out.println((n == rev) ? "It is a palindrome number" : "It is not a palindrome number");
    }

    public static int findReverse(int n) {
        int rem = 0, rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }
}
