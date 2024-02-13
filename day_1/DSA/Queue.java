// simple queue implementation with add , remove and length operation. (n sized q)

import java.util.Scanner;

public class Queue {
    static int N=5;
    static int array[]=new int[N];
    static int front = -1;
    static int rear = -1;
    static Scanner scanner = new Scanner(System.in);

    static void enqueue() {
        int x;
        if (rear == N - 1) {
            System.out.println("Overflow");
        } else if (rear == -1) {
            front = rear = 0;
            System.out.print("Enter number: ");
            x = scanner.nextInt();
            array[rear] = x;
        } else {
            rear++;
            System.out.print("Enter number: ");
            x = scanner.nextInt();
            array[rear] = x;
        }
    }

    static void dequeue() {
        if (front > rear)
            System.out.println("Underflow");
        else if (front == -1)
            System.out.println("Empty");
        else {
            System.out.println("Deleted number: " + array[front]);
            front++;
        }
    }

    static void length() {
        if (front > rear)
            System.out.println("0");
        else if (front == -1)
            System.out.println("0");
        else if(front==0)
            System.out.println("Length: "+(rear+1));
        else
            System.out.println("Length: "+((rear+1)-front));
    }

    static void display() {
        if (front > rear)
            System.out.println("Empty");
        else if (front == -1)
            System.out.println("Empty");
            else {
                System.out.print("Queue: ");
                for (int i = front; i <= rear; i++)
                    System.out.print(array[i]+" ");
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int ch, opt;
        do {
            System.out.println("Enter 1 for insertion");
            System.out.println("Enter 2 for deletion");
            System.out.println("Enter 3 for length");
            System.out.println("Enter 4 for display");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    length();
                    break;
                case 4:
                    display();
                    break;
                default:
                    System.out.println("Enter valid option.");
            }
            System.out.print("Do you want to continue YES(1) NO(0): ");
            opt = scanner.nextInt();
        } while (opt == 1);
    }
}


