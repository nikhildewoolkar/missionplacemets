package DSA_Problems;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    public CircularLinkedList() {
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
    }
}

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(9);
    }
}
