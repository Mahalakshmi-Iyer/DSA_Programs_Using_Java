package BinaryTrees;

public class SumOfNodes {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public int findSum(Node root) {
            if (root == null)
                return 0;
            int left_sum = findSum(root.left);
            int right_sum = findSum(root.right);
            return (left_sum + right_sum + root.data);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Sum of Nodes of tree is : " + tree.findSum(root));

    }
}
