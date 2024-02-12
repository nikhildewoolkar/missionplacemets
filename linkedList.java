class dsa {
    int data;
    dsa next;

    dsa(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {
    private dsa head;

    public linkedlist() {
        this.head = null;
    }

    public void addAtEnd(int data) {
        dsa newNode = new dsa(data);
        if (head == null) {
            head = newNode;
            return;
        }
        dsa current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addAtStart(int data) {
        dsa newNode = new dsa(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addAtStart(data);
            return;
        }
        dsa newNode = new dsa(data);
        dsa current = head;
        int currentPosition = 0;
        while (currentPosition < position - 1 && current != null) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void removeFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        dsa current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void removeAtPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("Invalid operation");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        dsa current = head;
        int currentPosition = 0;
        while (currentPosition < position - 1 && current != null) {
            current = current.next;
            currentPosition++;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position");
            return;
        }
        current.next = current.next.next;
    }

    public int length() {
        int length = 0;
        dsa current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void printList() {
        dsa current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtStart(5);
        list.addAtPosition(15, 2);

        System.out.println("Original list:");
        list.printList();

        list.removeFromStart();
        list.removeFromEnd();
        list.removeAtPosition(1);

        System.out.println("List after removals:");
        list.printList();

        System.out.println("Length of the list: " + list.length());
    }
}
public class Main {
    public static void main(String[] args) {
        linkedlist.main(args); // Call the main method in linkedlist class
    }
}