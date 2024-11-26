package Strings;

import java.util.*;

public class CheckForAnagram {
    public static void main(String[] args) {

        System.out.println("Program to check if two words are anagrams");
        String word1 = "earth";
        String word2 = "heart";
        if (anagramCheck(word1, word2)) {
            System.out.println("For eg : " + word1 + " and " + word2 + " are anagrams");
        } else {
            System.out.println("For eg : word 1 - " + word1 + " and word 2 - " + word2 + " are not anagrams");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 words to check for anagram : ");
        word1 = sc.next();
        word2 = sc.next();

        if (anagramCheck2(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams");
        }
        sc.close();
    }

    public static boolean anagramCheck(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char charArr1[] = word1.toCharArray();
        char charArr2[] = word2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }

    public static boolean anagramCheck2(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        int charCount[] = new int[26];
        char ch1, ch2;
        for (int i = 0; i < word1.length(); i++) {
            ch1 = word1.charAt(i);
            ch2 = word2.charAt(i);
            charCount[ch1 - 'a']++;
            charCount[ch2 - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
