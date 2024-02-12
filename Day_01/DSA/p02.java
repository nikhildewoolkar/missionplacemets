package Day_01.DSA;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class p02 {
    private ListNode head;
    private int length;

    // constructor setting the head of the list as null.
    public p02() {
        this.head = null;
        this.length = 0;
    }

    // returns length of the current linked list.
    public int length() {
        return length;
    }

    // function to add an elemnt to the end.
    public void addAtEnd(int val) {
        ListNode newNode = new ListNode(val);
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

    // function to add an element to the start
    public void addAtStart(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    // function to add an element at a particular index.
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) {
            System.out.println("Error: Index out of bounds");
            return;
        }
        if (index == 0) {
            addAtStart(val);
        } else if (index == length) {
            addAtEnd(val);
        } else {
            ListNode newNode = new ListNode(val);
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }
    }

    // function to delete an element from the start.
    public void removeFromStart() {
        if (head == null) {
            System.out.println("Error: List is empty");
            return;
        }
        head = head.next;
        length--;
    }

    // function to delete an element from the end.
    public void removeFromEnd() {
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

    // function to delete an element from a particular index.
    public void removeAtIndex(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Error: Index out of bounds");
            return;
        }
        if (index == 0) {
            removeFromStart();
        } else if (index == length - 1) {
            removeFromEnd();
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            length--;
        }
    }

    // function to display the current linke list.
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        p02 list = new p02();

        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        System.out.println("Current Linked list: ");
        list.printList();

        list.addAtStart(0);
        list.addAtIndex(2, 10);


        System.out.println("Length: " + list.length());
        System.out.println("Current Linked list: ");
        list.printList();

        list.removeFromStart();
        list.removeFromEnd();
        list.removeAtIndex(1);

        System.out.println("Length: " + list.length());
        System.out.println("Current Linked list: ");
        list.printList();
    }
}
