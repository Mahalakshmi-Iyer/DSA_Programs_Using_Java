package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
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

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true; // cycle detected
        }
        return false; // cycle not detected
    }

    public void removeCycle() {
        // step 1 : detect cycle
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (flag == false)
            return;

        // step 2 : find starting node of cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Starting node of cycle : " + fast.data);

        // step 3 : remove cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        tail.next = head.next;
        // LL is 1 -> 2 -> 3
        boolean ans = ll.detectCycle();
        if (ans)
            System.out.println("Cycle detected in LL");
        else
            System.out.println("Cycle not detected in LL");

        ll.removeCycle();
        System.out.println("LL after removing cycle : ");
        ll.print();

        // LL using collection framework

        LinkedList<Integer> l = new LinkedList<>();
        l.addLast(1);
        l.addLast(2);
        l.addFirst(0);
        l.add(3, 3);
        System.out.println(l);
        l.removeLast();
        l.removeFirst();
        l.remove(1);
        System.out.println(l);
    }
}
