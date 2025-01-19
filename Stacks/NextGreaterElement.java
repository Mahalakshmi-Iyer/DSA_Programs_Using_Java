package Stacks;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // step 1 : pop smaller elements
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            // step 2 : find next greater element
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // step 3 : push curr value to stack
            s.push(i);
        }

        System.out.println("Next Greater Elements : ");
        for (int i : nextGreater) {
            System.out.print(i + " ");
        }
    }
}
