package LinkedList;

public class LinkedList3 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size;

    public Node getIntersection(Node head1, Node head2) {
        Node t2 = head2;
        while (t2 != null) {
            Node t1 = head1;
            while (t1 != null) {
                if (t1 == t2)
                    return t2;
                t1 = t1.next;
            }
            t2 = t2.next;
        }
        return null;
    }

    public static void main(String args[]) {

        LinkedList3 ll = new LinkedList3();
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(4);
        head2.next = new Node(5);

        head1.next.next.next = head2.next.next = new Node(6);
        head2.next.next.next = new Node(7);
        head2.next.next.next.next = null;

        Node intersection = ll.getIntersection(head1, head2);
        if (intersection == null)
            System.out.println("No intersection point");
        else
            System.out.println("Intersection point : " + intersection.data);
    }
}