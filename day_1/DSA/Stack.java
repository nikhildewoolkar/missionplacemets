import java.util.Scanner;

public class Stack {
    static int top;
    static int N=5;
    static int[] stack = new int[N];
    static Scanner sc = new Scanner(System.in);

    static void push() {
        System.out.print("Enter number : ");
        int val = sc.nextInt();
        if (top == N - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            stack[top] = val;
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Empty");
        } else {
            int p = stack[top];
            top--;
            System.out.println("Pop element is" + p);
        }
    }
    static void peek()
    {
        if (top == -1) {
            System.out.println("Empty");
        }
        else{
            System.out.println("Peek: "+stack[top]);
        }
    }
    static void display() {
        if (top == -1) {
            System.out.println("Empty");
        } else {
            System.out.println("Stack :");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        top = -1;
        int ch, opt;
        do {
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for peek");
            System.out.println("Enter 4 for display");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                default:
                    System.out.println("Not valid Option.");
                    break;
            }
            System.out.print("Do you want to continue, enter Yes(1) or No(0) : ");
            opt = sc.nextInt();
        } while (opt == 1);
        sc.close();
    }
}
