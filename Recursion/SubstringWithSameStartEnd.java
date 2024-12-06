package Recursion;

import java.util.*;

public class SubstringWithSameStartEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing count of substrings with same start and end character");
        // eg : for abcab, count = 7 (a, abca, b, bcab, c, a, b) , repetitions are
        // allowed
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        int count = calcSubstring(str, 0, str.length() - 1, str.length());
        System.out.println("Count of substrings with same start and end is : " + count);
        sc.close();
    }

    public static int calcSubstring(String str, int i, int j, int n) {
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;

        int count = calcSubstring(str, i + 1, j, n - 1) + calcSubstring(str, i, j - 1, n - 1)
                - calcSubstring(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j))
            count++;
        return count;
    }
}
