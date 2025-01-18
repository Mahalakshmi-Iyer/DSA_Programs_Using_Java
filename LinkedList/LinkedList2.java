package LinkedList;

public class LinkedList2 {
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

    // slow-fast pointer approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null)
            return head;

        // find mid
        Node mid = findMid(head);

        // perform merge sort on left and right halves
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // call merge()
        return merge(newLeft, newRight);
    }

    public Node merge(Node lhead, Node rhead) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (lhead != null && rhead != null) {
            if (lhead.data <= rhead.data) {
                temp.next = lhead;
                lhead = lhead.next;
                temp = temp.next;
            } else {
                temp.next = rhead;
                rhead = rhead.next;
                temp = temp.next;
            }
        }

        while (lhead != null) {
            temp.next = lhead;
            lhead = lhead.next;
            temp = temp.next;
        }
        while (rhead != null) {
            temp.next = rhead;
            rhead = rhead.next;
            temp = temp.next;
        }

        tail = temp;

        return mergedLL.next;
    }

    public void zigzag(Node head) {
        // find mid node
        Node mid = findMid(head);

        // reverse right half of ll
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // zig zag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(1);

        System.out.println(head.data);

        System.out.println("Original Linked List : ");
        ll.print();
        head = ll.mergeSort(head);
        System.out.println("Sorted Linked List : ");
        ll.print();
        System.out.println("Head node is " + head.data + " and Tail node is " + tail.data);

        System.out.println("LL in Zig-Zag pattern : ");
        ll.zigzag(head);
        ll.print();
    }

}
