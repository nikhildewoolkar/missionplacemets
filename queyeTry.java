import java.util.LinkedList;
import java.util.Queue;

class queueTry {
    public static void main (String args[]) {
       Queue<Integer> queue = new LinkedList<>();
  
        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
  
        // Peek: Retrieve but do not remove the head of the queue
        System.out.println("Peek: " + queue.peek()); // Output: 1
  
        // Dequeue and print elements
        System.out.println("Dequeue: " + queue.poll()); // Output: 1
        System.out.println("Dequeue: " + queue.poll()); // Output: 2
  
        // Enqueue more elements
        queue.offer(4);
        queue.offer(5);
  
        // Dequeue and print elements
        System.out.println("Dequeue: " + queue.poll()); // Output: 3
        System.out.println("Dequeue: " + queue.poll()); // Output: 4
        System.out.println("Dequeue: " + queue.poll()); // Output: 5
  
        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: true
    }
  }