package dsa;
public class stack {
    private int[] stackArray;
    private int top; // Index of the top element
    private int maxSize; // Maximum size of the stack

    // Constructor to initialize the stack with a given size
    public stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to push an element onto the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push element onto a full stack");
            return;
        }
        top++;
        stackArray[top] = data;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element from an empty stack");
            return -1; // Return a default value indicating failure
        }
        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return a default value indicating failure
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        int stackSize = 5;
        stack stack = new stack(stackSize);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element of the stack: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element of the stack after popping: " + stack.peek());
    }
}
