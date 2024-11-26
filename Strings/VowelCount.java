package Strings;

import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();

        int vowelCount = getVowelCount(str);
        System.out.println("Count of lowercase vowels in the sentence : " + vowelCount);

        sc.close();
    }

    public static int getVowelCount(String str) {
        int n = str.length();
        char ch;
        int count = 0;

        for (int i = 0; i < n; i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
