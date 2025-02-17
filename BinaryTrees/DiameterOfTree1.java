package BinaryTrees;

public class DiameterOfTree1 {
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

        public int findHeight(Node root) {
            if (root == null)
                return 0;
            int left_ht = findHeight(root.left);
            int right_ht = findHeight(root.right);
            return Math.max(left_ht, right_ht) + 1;
        }

        public int findDiameter(Node root) {
            if (root == null)
                return 0;
            int left_diam = findDiameter(root.left);
            int right_diam = findDiameter(root.right);

            int left_ht = findHeight(root.left);
            int right_ht = findHeight(root.right);
            int self_diam = left_ht + right_ht + 1;

            return Math.max(Math.max(left_diam, right_diam), self_diam);
        }
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes[] = { 1, 2, 4, 8, -1, 9, -1, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3, -1,
                -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root node of tree : " + root.data);
        System.out.println("Height of tree is : " + tree.findHeight(root));
        System.out.println("Diameter of Tree is : " + tree.findDiameter(root));

    }
}
