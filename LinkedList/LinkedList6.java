package LinkedList;

public class LinkedList6 {
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

    public static Node merge(Node lhead, Node rhead) {
        Node newHead = new Node(-1);
        Node temp = newHead;

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
        if (lhead != null)
            temp.next = lhead;
        if (rhead != null)
            temp.next = rhead;

        return newHead.next;
    }

    public static void sortEvenOdd(Node head) {
        Node curr = head, prev = null, end = head;
        while (end.next != null)
            end = end.next;

        Node new_end = end;

        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else
            prev = curr;
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    public static void main(String args[]) {

        Node head1 = new Node(3);
        head1.next = new Node(4);
        head1.next.next = new Node(8);
        head1.next.next.next = null;

        Node head2 = new Node(2);
        head2.next = new Node(5);
        head2.next.next = new Node(9);
        head2.next.next.next = new Node(14);
        head2.next.next.next.next = null;

        System.out.println("LL 1 : ");
        print(head1);
        System.out.println("LL 2 : ");
        print(head2);

        Node newHead = merge(head1, head2);
        System.out.println("Merged LL : ");
        print(newHead);

        System.out.println("Even Odd sorted LL : ");
        sortEvenOdd(newHead);
        print(newHead);
    }
}
