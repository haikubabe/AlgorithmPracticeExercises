public class AVLTree {
    private Node root;

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private int height(Node root) {
        if (root == null) return -1;
        return root.height;
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    private int getBalanceFactor(Node root) {
        if (root == null) return -1;
        return height(root.right) - height(root.left);
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        //rotate
        x.right = y;
        y.left = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return x;
    }

    private Node leftRotate(Node y) {
        Node x = y.right;
        Node T2 = x.left;

        //rotate
        x.left = y;
        y.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return x;
    }

    private Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else if (key > root.data) root.right = insert(root.right, key);
        else return root;
        //find the height of the root
        root.height = max(height(root.left), height(root.right)) + 1;
        int balanceFactor = getBalanceFactor(root);
        //Case 1: Left Left case
        if (balanceFactor < -1 && key < root.left.data) {
            return rightRotate(root);
        }
        //Case 2: Right Right case
        if (balanceFactor > 1 && key > root.right.data) {
            return leftRotate(root);
        }
        //Case 3: Left Right case
        else if (balanceFactor < -1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        //Case 4: Right Left case
        else if (balanceFactor > 1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.root = avlTree.insert(avlTree.root, 5);
        avlTree.root = avlTree.insert(avlTree.root, 2);
        avlTree.root = avlTree.insert(avlTree.root, 1);
        avlTree.root = avlTree.insert(avlTree.root, 4);
        avlTree.root = avlTree.insert(avlTree.root, 3);
        avlTree.root = avlTree.insert(avlTree.root, 7);
        avlTree.root = avlTree.insert(avlTree.root, 6);
        avlTree.root = avlTree.insert(avlTree.root, 9);
        avlTree.root = avlTree.insert(avlTree.root, 16);
        avlTree.root = avlTree.insert(avlTree.root, 15);
        avlTree.inorder(avlTree.root);
    }
}
