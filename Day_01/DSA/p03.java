package Day_01.DSA;

import java.util.Scanner;

class Queue{
    private int arr[];
    private int start, end, currSize, maxSize;

    // constructor to initialize the queue.
    public Queue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    // function to add an element from the end.
    public void enqueue(int newElement){
        if(currSize == maxSize){
            System.out.println("Queue is full. ");
            System.exit(1);
        } 
        if(end == -1){
            start = 0;
            end = 0;
        } else
        end = (end + 1)%maxSize;
        arr[end] = newElement;
        currSize++;
    }

    // function to delete an element from the front.
    public int dequeue(){
        if(start == -1){
            System.out.println("Queue is empty. ");
            System.exit(1);
        }
        int dequeued = arr[start];
        if(currSize == 1){
            start = -1;
            end = -1;
        } else
        start = (start + 1)%maxSize;
        currSize--;
        return dequeued;
    }
    
    // function to return the size of the current queue.
    public int size(){
        return currSize;
    }
}
public class p03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of queue: ");
        int n = sc.nextInt();

        Queue q = new Queue(n);
        q.enqueue(4);
        q.enqueue(14);
        q.enqueue(24);
        q.enqueue(34);
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.dequeue());
        System.out.println("The size of the queue after deleting an element " + q.size());
        sc.close();
    }
}
