package Stacks;

import java.util.*;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String str1 = "((a+b)+(c+d))";
        String str2 = "(((a+(b)))+(c+d))";

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing bracket
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count == 0)
                    return true;
                else
                    s.pop();
            }
            // opening bracket, operand, operator
            else {
                s.push(ch);
            }
        }
        return false;
    }
}
