class MyNode {
    int data;
    MyNode next;

    MyNode(int data) {
        this.data = data;
        next = null;
    }
}

public class CircularLinkedList {
    private MyNode head;

    void traversal() {
        if (head == null) return;
        MyNode current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }

    void insert(int data) {
        MyNode node = new MyNode(data);
    }
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.head = new MyNode(1);
        MyNode second = new MyNode(2);
        MyNode third = new MyNode(3);
        circularLinkedList.head.next = second;
        second.next = third;
        third.next = circularLinkedList.head;
        circularLinkedList.traversal();
    }
}
