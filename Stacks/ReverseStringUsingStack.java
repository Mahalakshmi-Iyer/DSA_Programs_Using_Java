package Stacks;

import java.util.*;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse : ");
        String str = sc.nextLine();

        String rev = reverseString(str);
        System.out.println("Reversed String : " + rev);
        sc.close();
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder rev = new StringBuilder("");
        while (!s.isEmpty()) {
            char ch = s.pop();
            rev.append(ch);
        }

        return rev.toString();
    }
}
