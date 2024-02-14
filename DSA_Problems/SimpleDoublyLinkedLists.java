package DSA_Problems;

public class SimpleDoublyLinkedLists {
	public static void main(String[] args) {
		SimpleDoublyLinkedLists list = new SimpleDoublyLinkedLists();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6); 
    }
    
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
}

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public int DeleteFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        }
        int val = head.data;
        return val;
    }
    public void InsertLast(int val){
        Node node = new Node(val);
        if(size == 0){
            insertFirst(val);
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void Insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next, temp);
        temp.next = node;
        temp.next.prev = node;
        size++;
    }

    public int Delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        return index;   
    }
    public int DeleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public Node Find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node Get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void Set(int index, int val) {
        Node node = get(index);
        node.data = val;
    }

    public boolean isempty() {
        return size == 0;
    }

    public int Size() {
        return size;
    }

    public int Delete(Node node) {
        return 0;
    }   

    public int deleteFirst() {
        return 0;
    }

    public int deleteLast() {
        return 0;
    }

    public void insertLast(int val) {
    }

    public void insert(int val, int index) {
    }

    public int delete(int index) {
        return 0;
    }

    public Node find(int value) {
        return null;
    }

    public Node get(int index) {
        return null;
    }

    public void set(int index, int val) {
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    public int delete(Node node) {
        return 0;
    }
}