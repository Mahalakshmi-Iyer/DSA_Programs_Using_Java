package LinkedList;

import java.util.*;

public class LinkedList4 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    public void addLast(int data) {
        // step 1 : create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 : tail -> next = newNode
        tail.next = newNode;

        // step 3 : tail = newNode
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNafterM(int m, int n) {
        Node curr = head;
        while (curr != null) {
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null)
                return;
            Node temp = curr.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
    }

    public static void main(String args[]) {
        LinkedList4 ll = new LinkedList4();
        for (int i = 1; i <= 8; i++) {
            ll.addLast(i);
        }

        // for (int i = 1; i <= 10; i++) {
        // ll.addLast(i);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("----- Delete N nodes after M nodes of LL -----");
        System.out.println("Enter m : ");
        int m = sc.nextInt();

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Original LL :");
        ll.print();
        System.out.println("New LL : ");
        ll.deleteNafterM(m, n);
        ll.print();

        sc.close();
    }
}