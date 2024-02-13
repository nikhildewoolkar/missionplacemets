package Day_02.DSA;

import java.util.Scanner;


class node {
    int data;
    node next;
    node back;

    // paramaterized constructor which initializes a node which has data as well as back and next.
    public node(int data, node next, node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    // paramaterized constructor which initializes a node which has only data.
    public node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class p02 {

    // function to convert array to list.
    static node arrToList(int[] arr) {
        node head = new node(arr[0]);  // Create the head node with the first element of the array.
        node prev = head;  // Initialize 'prev' to the head node

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from the array and set its 'back' pointer to the previous node
            node temp = new node(arr[i], null, prev);
            prev.next = temp;  // Update the 'next' pointer of the previous node to point to the new node
            prev = temp;  // Move 'prev' to the newly created node for the next iteration
        }
        return head;
    }

    // Function to print the elements of the doubly linked list
    static void display(node head) {
        while (head != null) {
            System.out.print(head.data + "-->");  // Print the data in the current node
            head = head.next;  // Move to the next node
        }
        System.out.println();
    }

    static int length(node head) {
        int count = 0;
        node curr = head;

        // Traverse the list forward
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    // function to insert a node at the start of the doubly linked list.
    static node insertAtStart(node head, int val) {
        node newNode = new node(val);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.back = newNode;
        head = newNode;  // make head points to the newNode 

        return head;
    }

    static node insertAtEnd(node head, int val) {
        node newNode = new node(val);

        if (head == null) {
            return newNode;
        }

        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode = curr;

        return head;
    }

    // Function to delete the tail of the doubly linked list
    static node deleteAtEnd(node head) {
        if (head == null || head.next == null) {
            System.out.println("Error: The list is empty or only single node exists.");
            return null;  // Return null if the list is empty or contains only one element
        }

        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        if (curr.back != null) {
            curr.back.next = null;
        } else {
            System.out.println("Error: The list is empty.");
        }

        return head;
    }

    // Function to delete the head of the doubly linked list
    static node deleteAtStart(node head) {
        if (head == null || head.next == null) {
            System.out.println("Error: The list is empty or only single node exists.");
            return null;  // Return null if the list is empty or contains only one element
        }

        node prev = head;
        head = head.next;

        head.back = null;  // Set 'back' pointer of the new head to null
        prev.next = null;  // Set 'next' pointer of 'prev' to null

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        node head = arrToList(arr);
        System.out.println("Linked list at this point: ");
        display(head);

        head = insertAtEnd(head, 78);
        System.out.println("Linked list at this point: ");
        display(head);

        head = insertAtStart(head, 90);
        System.out.println("Linked list at this point: ");
        display(head);

        head = deleteAtStart(head);
        System.out.println("Linked list at this point: ");
        display(head);

        head = deleteAtEnd(head);
        System.out.println("Linked list at this point: ");
        display(head);

        System.out.println("Length of the the Linked List is: " + length(head));

        sc.close();
    }

}