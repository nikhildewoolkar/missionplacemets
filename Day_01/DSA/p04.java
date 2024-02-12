package Day_01.DSA;

import java.util.Scanner;

class Stack{
    private int arr[];
    private int top, maxSize;

    // constructor class to initialize the stack.
    public Stack(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        top = -1;
    }

    // function to push an element into the stack.
    public void push(int val){
        if(top == maxSize){
            System.out.println("Stack is full.");
            System.exit(1);
        } else{
        top++;
        arr[top] = val;
        }
    }

    // function to pop an element from the stack.
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty.");
            System.exit(1);
        } else{
        int val = arr[top];
        top--;
        System.out.println("The popped element is: " + val);
        }
    }

    // function to peek the top element of the stack.
    public int peek(){
        return arr[top];
    }
}
public class p04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Stack: ");
        int n = sc.nextInt();

        Stack s = new Stack(n);
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.peek());
        s.pop();
        System.out.println("Top of the stack after deleting an element " + s.peek());
        sc.close();
    }
}
