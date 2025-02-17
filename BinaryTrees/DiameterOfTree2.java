package BinaryTrees;

public class DiameterOfTree2 {
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

    public static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
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

        public Info findDiameter(Node root) {
            if (root == null)
                return new Info(0, 0);
            Info left_info = findDiameter(root.left);
            Info right_info = findDiameter(root.right);

            int self_diam = Math.max(Math.max(left_info.diam, right_info.diam), (left_info.ht + right_info.ht + 1));
            int ht = Math.max(left_info.ht, right_info.ht) + 1;

            return new Info(self_diam, ht);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, 4, 8, -1, 9, -1, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3,
        // -1,
        // -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root node of tree : " + root.data);
        System.out.println("Height of tree is : " + tree.findHeight(root));
        System.out.println("Diameter of Tree is : " + tree.findDiameter(root).diam);

    }
}
