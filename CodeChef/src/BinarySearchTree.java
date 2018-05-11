public class BinarySearchTree {
    private Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    BinarySearchTree() {
        root = null;
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    private Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private Node inorderPredecessor(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    private Node search(Node root, int key) {
        if (root == null || root.data == key) return root;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    private Node insert(Node root, int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
        } else if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    private Node delete(Node root, int key) {
        if (root == null) return root;
        if (key < root.data) root.left = delete(root.left, key);
        else if (key > root.data) root.right = delete(root.right, key);
            //if the key to be deleted is the root node
        else {
            //if the node to be deleted is the leaf node
            if (root.left == null && root.right == null) root = null;
                //if the node to be deleted has one child
            else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            }
            //if the node to be deleted has two child
            else {
                //find the predecessor or successor of the node
                Node successor = inorderSuccessor(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }

    private Node maxNode(Node root) {
        if (root == null || root.right == null) return root;
        return maxNode(root.right);
    }

    private Node minNode(Node root) {
        if (root == null || root.left == null) return root;
        return minNode(root.left);
    }

    private int height(Node root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return 0;
        return max(height(root.left), height(root.right)) + 1;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = new Node(46);
        binarySearchTree.insert(binarySearchTree.root, 24);
        binarySearchTree.insert(binarySearchTree.root, 26);
        binarySearchTree.insert(binarySearchTree.root, 30);
        binarySearchTree.insert(binarySearchTree.root, 22);
        binarySearchTree.insert(binarySearchTree.root, 49);
        binarySearchTree.insert(binarySearchTree.root, 90);
        binarySearchTree.insert(binarySearchTree.root, 80);
        binarySearchTree.insert(binarySearchTree.root, 85);
        binarySearchTree.insert(binarySearchTree.root, 47);
        binarySearchTree.inorder(binarySearchTree.root);
        System.out.println("Height is: " + binarySearchTree.height(binarySearchTree.root));
        System.out.println("Search key is: " + binarySearchTree.search(binarySearchTree.root, 49).data);
        binarySearchTree.delete(binarySearchTree.root, 49);
//        binarySearchTree.delete(binarySearchTree.root, 26);
//        binarySearchTree.delete(binarySearchTree.root, 22);
        binarySearchTree.inorder(binarySearchTree.root);
        System.out.println("Max node is: " + binarySearchTree.maxNode(binarySearchTree.root).data);
        System.out.println("Min node is: " + binarySearchTree.minNode(binarySearchTree.root).data);
        System.out.println("Height is: " + binarySearchTree.height(binarySearchTree.root));
    }
}
