package Stacks;

import java.util.*;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Original stack : " + s);
        System.out.println("Enter element to push at bottom of stack : ");
        int n = sc.nextInt();

        pushBottom(s, n);
        System.out.println("New stack : " + s);
        sc.close();

        reverseStack(s);
        System.out.println("Reversed stack : " + s);
    }

    public static void pushBottom(Stack<Integer> s, int data) {
        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // recursion step
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        // base case
        if (s.isEmpty())
            return;

        // recursion step
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }
}
