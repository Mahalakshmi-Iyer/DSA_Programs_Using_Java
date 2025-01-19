package LinkedList;

import java.util.*;

public class LinkedList5 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void swapNodes(Node head, int x, int y) {
        if (x == y)
            return;

        Node currX = head, prevX = null;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node currY = head, prevY = null;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null)
            return;

        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("----- Swapping 2 nodes in a LL ------");
        System.out.println("Enter first key : ");
        int x = sc.nextInt();
        System.out.println("Enter second key : ");
        int y = sc.nextInt();

        System.out.println("Original LL : ");
        print(head);

        swapNodes(head, x, y);
        System.out.println("New LL : ");
        print(head);

        sc.close();
    }
}
