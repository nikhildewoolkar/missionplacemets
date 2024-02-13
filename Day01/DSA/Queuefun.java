package Day01.DSA;
import java.util.*;

class Queue{
    int[] arr;
    int front,rear,size,capicity;

    public Queue(int n){
        capicity=n;
        arr=new int[capicity];
        front=0;
        rear=-1;
        size=0;
    }

    void add(int value){
        if(size==capicity){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1)%capicity;
        arr[rear]=value;
        size++;
    }
    void delete(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        int remove_element = arr[front];
        front = (front+1)%capicity;
        size--;
        System.out.println("\nRemoved element is: " + remove_element);
    }

    void display(){
        System.out.println();
        for(int i=front ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Queuefun{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();

        q.add(60);
        q.display();
        
        q.delete();
        q.display();

        q.delete();
        q.display();


    }
}