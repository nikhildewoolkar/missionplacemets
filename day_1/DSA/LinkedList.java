package missionplacemets.day_1.DSA;


class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    ListNode head;
    int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public void insertionAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void insertionAtStart(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertionAtIndex(int index, int data) {
        if (index < 0 || index > length) {
            System.out.println("Error: Index out of bounds");
            return;
        }
        if (index == 0) {
            insertionAtStart(data);
        } else if (index == length) {
            insertionAtEnd(data);
        } else {
            ListNode newNode = new ListNode(data);
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }
    }

    public void deletionAtStart() {
        if (head == null) {
            System.out.println("Error: List is empty");
            return;
        }
        head = head.next;
        length--;
    }

    public void deletionAtEnd() {
        if (head == null) {
            System.out.println("Error: List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            ListNode current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        length--;
    }

    public void deletionAtIndex(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Error: Index out of bounds");
            return;
        }
        if (index == 0) {
            deletionAtStart();
        } else if (index == length - 1) {
            deletionAtEnd();
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            length--;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertionAtEnd(1);
        l1.insertionAtEnd(2);
        l1.insertionAtEnd(3);
        System.out.println("Linked l1: ");
        l1.display();
        l1.insertionAtStart(4);
        l1.insertionAtIndex(2, 8);
        System.out.println("Linked l1: ");
        l1.display();
        System.out.println("Length: " + l1.length());
        l1.deletionAtStart();
        l1.deletionAtEnd();
        l1.deletionAtIndex(1);
        System.out.println("Linked l1: ");
        l1.display();
        System.out.println("Length: " + l1.length());
    }
}