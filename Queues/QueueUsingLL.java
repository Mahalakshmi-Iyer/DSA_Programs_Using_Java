package Queues;

public class QueueUsingLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node front = null;
        static Node rear = null;

        public boolean isEmpty() {
            return (front == null && rear == null);
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = rear.next;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int top = front.data;
            if (rear == front)
                rear = front = null;
            else
                front = front.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
