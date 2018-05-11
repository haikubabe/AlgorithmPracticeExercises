class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Tree {
    Node root;

    //search in BST
    private void inorder(Node root) {
        if (root == null) return;
        else {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }


    private Node search(Node root, int data) {
        if (root == null) return root;

        Node node=null;
        if (root.data == data)  return root;
        else if (data < root.data)
            return search(root.left, data);
        else if (data > root.data)
            node = search(root.right, data);
        return node;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(2);
        tree.root.left = new Node(1);
        tree.root.right = new Node(3);
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Search : " + tree.search(tree.root, 4).data);
    }
}