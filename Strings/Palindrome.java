package Strings;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word in lower case : ");
        String word = sc.nextLine();

        boolean ans = isPalindrome(word);
        if (ans) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(String word) {
        int n = word.length();

        for (int i = 0; i < (n / 2); i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}