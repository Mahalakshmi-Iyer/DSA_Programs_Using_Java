package Stacks;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a parentheses string : ");
        String str = sc.next(); // ()({})[]
        if (isValid(str))
            System.out.println("Given string is a valid parentheses");
        else
            System.out.println("Given string is not a valid parentheses");

        sc.close();
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') // opening brackets
                s.push(ch);

            else { // closing brackets
                if (s.isEmpty())
                    return false;
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}'))
                    s.pop();
                else
                    return false;
            }
        }

        if (s.isEmpty())
            return true;
        else
            return false;
    }
}
