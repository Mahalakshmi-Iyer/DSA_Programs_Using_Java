package BinaryTrees;

public class SubtreeOfTree {
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
        int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null)
                return true;
            else if (root == null || subroot == null || root.data != subroot.data)
                return false;

            if (!isIdentical(root.left, subroot.left))
                return false;
            if (!isIdentical(root.right, subroot.right))
                return false;

            return true;
        }

        public boolean isSubtree(Node root, Node subroot) {
            if (root == null)
                return false;
            if (root.data == subroot.data && isIdentical(root, subroot)) {
                return true;
            }

            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }

    }

    public static void main(String[] args) {
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes2[] = { 2, 4, -1, -1, 5, -1, -1 };

        BinaryTree tree1 = new BinaryTree();
        Node root = tree1.buildTree(nodes1);
        BinaryTree tree2 = new BinaryTree();
        Node subroot = tree2.buildTree(nodes2);

        boolean ans = tree1.isSubtree(root, subroot);
        if (ans == true)
            System.out.println("Subtree exists in the tree");
        else
            System.out.println("Subtree does not exist in the tree");

    }
}
