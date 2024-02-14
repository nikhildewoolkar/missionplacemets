package DSA_Problems;

public class SimpleCircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public SimpleCircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    
    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }
    
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % size;
        }
        return result;
    }
}
