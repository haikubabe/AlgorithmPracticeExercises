class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Tree {
    private Node root;

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(12);
        tree.root.left = new Node(5);
        tree.root.right = new Node(18);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(9);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(19);
        tree.root.right.left.left = new Node(13);
        tree.root.right.left.right = new Node(17);
        System.out.println("Inorder traversal: ");
        tree.inorder(tree.root);
    }
}
