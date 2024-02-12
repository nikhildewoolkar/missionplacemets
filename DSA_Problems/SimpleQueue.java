package DSA_Problems;

public class SimpleQueue {
     private int maxSize;
     private long[] queArray;
     private int front;
     private int rear;
     private int nItems;

     public SimpleQueue(int s) {
          maxSize = s;
          queArray = new long[maxSize];
          front = 0;
          rear = -1;
          nItems = 0;
     }
     public void insert(long j) {
          if(rear == maxSize-1) {
               rear = -1;
          }
          queArray[++rear] = j;
          nItems++;
     }
     public long remove() {
          long temp = queArray[front++];
          if(front == maxSize) {
               front = 0;
          }
          nItems--;
          return temp;
     }
     public long peekFront() {
          return queArray[front];
     }
     public boolean isEmpty() {
          return (nItems==0);
     }
     public boolean isFull() {
          return (nItems==maxSize);
     }
     public int size() {
          return nItems;
     }
     public void display() {
          for(int i=0;i<queArray.length;i++) {
               System.out.print(queArray[i]+" ");
          }
          System.out.println();
     }
     public static void main(String[] args) {
          SimpleQueue theQueue = new SimpleQueue(10);
          theQueue.insert(10);
          theQueue.insert(30);
          theQueue.insert(20);
          theQueue.insert(50);
          theQueue.insert(40);
          theQueue.insert(70);
          theQueue.insert(60);
          theQueue.insert(100);
          theQueue.insert(90);
          theQueue.insert(80);
          theQueue.display();

          while(!theQueue.isEmpty()) {
               System.out.print(theQueue.remove()+" ");
          }
          System.out.println();
     }

     public void display(int i) {
          System.out.println(queArray[i]);
     }
     public void display(long j) {
          System.out.println(j);
     }
     public void display(boolean b) {
          System.out.println(b);
     }
     public void display(String s) {
          System.out.println(s);
     }
     public void display(char c) {
          System.out.println(c);
     }
     public void display(double d) {
          System.out.println(d);
     }
     public void display(float f) {
          System.out.println(f);
     }
     public void display(Object o) {
          System.out.println(o);
     }
     public void display(int[] arr) {
          for(int i=0;i<arr.length;i++) {
               System.out.print(arr[i]+" ");
          }
          System.out.println();
     }
}