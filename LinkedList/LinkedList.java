package LinkedList;

// import java.util.*;

public class LinkedList {
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

    public void addFirst(int data) {
        // step 1 : create node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 : newNode -> next points to head
        newNode.next = head;

        // step 3 : head = newNode
        head = newNode;
    }

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

    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i = 0;
        while (i < (idx - 1)) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) // key found
                return i;
            temp = temp.next;
            i++;
        }
        return -1; // key not found
    }

    public int searchHelper(Node head, int key) {
        if (head == null)
            return -1;
        if (head.data == key)
            return 0;

        int idx = searchHelper(head.next, key);
        if (idx == -1)
            return -1;
        else
            return idx + 1;
    }

    public int recursiveSearch(int key) {
        return searchHelper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        tail = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        int s = 0; // size
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            s++;
        }

        if (n == s) {
            head = head.next; // removeFirst
            return;
        }

        int i = 1;
        int iToFind = s - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // slow-fast pointer approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null)
            return true;

        // step 1 : to find mid
        Node midNode = findMid(head);

        // step 2 : to reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step 3 : check left and right half for equality
        Node right = prev; // head node for the right half
        Node left = head;

        while (right != null) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addMiddle(3, 2);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll.size);
        // ll.print();
        // System.out.println(ll.size);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a key to find in the LL : ");
        // int key = sc.nextInt();
        // // int idx = ll.iterativeSearch(key);
        // int idx = ll.recursiveSearch(key);
        // if (idx != -1)
        // System.out.println("Key found at index " + idx);
        // else
        // System.out.println("Key not found in the LL");

        // sc.close();

        // ll.reverse();
        // ll.print();

        // ll.deleteNthFromEnd(2);
        // ll.print();

        ll.addFirst(1);
        ll.addLast(1);
        ll.addMiddle(2, 1);
        ll.print();

        if (ll.checkPalindrome())
            System.out.println("LL is a palindrome");
        else
            System.out.println("LL is not a palindrome");

    }
}
