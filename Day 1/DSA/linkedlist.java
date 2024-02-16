class Node {
    int rollNo;
    String name;
    Node next;

    public Node(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.next = null;
    }
}

class Linkedlist {

    public Node head;

    public Linkedlist(Node node) {
        this.head = node;
    }

    public void insert(Node node) {
        Node temp = head;
        Node prev = null;
        while (temp != null && temp.rollNo < node.rollNo) {
            prev = temp;
            temp = temp.next;
        }
        if (prev == null) {
            node.next = head;
            this.head = node;
        } else {
            prev.next = node;
            node.next = temp;
        }
    }

    public void delete(int rollNo) {
        Node temp = head;
        Node prev = null;

        while (temp != null && temp.rollNo != rollNo) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found");
        } else if (prev == null) {
            this.head = this.head.next;
        } else
            prev.next = temp.next;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist(new Node(1, "Lalit"));
        list.insert(new Node(3, "Raj"));
        list.insert(new Node(2, "Vaibhav"));
        list.insert(new Node(0, "Shashi"));
        list.delete(5);
        list.delete(0);
        list.delete(2);
        list.delete(3);
        list.print();
    }
}
