package Stacks;

import java.util.*;

public class PalindromeLinkedList {

    public static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node one = new Node('A');
        Node two = new Node('B');
        Node three = new Node('C');
        Node four = new Node('B');
        Node five = new Node('A');

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        boolean ans = isPalindrome(one);
        if (ans)
            System.out.println("The linked list is a palindrome");
        else
            System.out.println("The linked list is not a palindrome");
    }

    public static boolean isPalindrome(Node head) {
        Stack<Character> s = new Stack<>();

        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        while (head != null) {
            char top = s.pop();
            if (head.data != top) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
