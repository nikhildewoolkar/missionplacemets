import java.util.*;
import java.util.Stack;

class StackTry {
  public static void main(String args[]){
    Stack<Integer> stack = new Stack<>();

    // Push elements onto the stack
    stack.push(1);
    stack.push(2);
    stack.push(3);

    // Peek: Retrieve but do not remove the top element of the stack
    System.out.println("Peek: " + stack.peek()); // Output: 3

    // Pop and print elements
    System.out.println("Pop: " + stack.pop()); // Output: 3
    System.out.println("Pop: " + stack.pop()); // Output: 2

    // Push more elements
    stack.push(4);
    stack.push(5);

    // Pop and print elements
    System.out.println("Pop: " + stack.pop()); // Output: 5
    System.out.println("Pop: " + stack.pop()); // Output: 4

    // Check if the stack is empty
    System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: false
  }
}