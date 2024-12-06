package Recursion;

import java.util.*;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find its length : ");
        String str = sc.nextLine();

        int len = strLen(str);
        System.out.println("Length of the string is : " + len);
        sc.close();
    }

    public static int strLen(String str) {
        if (str.equals(""))
            return 0;
        return (strLen(str.substring(1)) + 1);
    }
}
