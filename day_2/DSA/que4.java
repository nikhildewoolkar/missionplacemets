// 4)st implementation with push , pop, peek, print,print while vacating operation.(dynamic size st)
import java.util.*;

class dynamicStack {
    private ArrayList<Integer> st;

    public dynamicStack() {
        st = new ArrayList<>();
    }

    public void push(int item) {
        st.add(item);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow."); 
        } else {
            System.out.println("Popped element: " + st.remove(st.size() - 1));
        }
    }
    
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow."); 
        } else {
            System.out.println("Peek element: " + st.get(st.size() - 1));
        }
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }
    public void size()
    {
        System.out.println("Current stack size: " + st.size());
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack Underflow."); 
        } else{
            System.out.print("Stack elements: ");
            for (int i =  st.size()-1; i>=0; i--) {
                System.out.print(st.get(i)+ " ");
            }
            System.out.println();
        }
    }

    public void printWhileVacating() {
        if (isEmpty()) {
            System.out.println("Stack Underflow."); 
        } else{
            System.out.print("Printing stack while vacating elements: ");
            // System.out.print("Stack elements: ");
            for (int i =  st.size()-1; i>=0; i--) {
                System.out.print(st.get(i)+ " ");
                st.remove(i);
            }
            System.out.println();
        }
    }
}    
    public class que4 {
    public static void main(String[] args) {
        dynamicStack st = new dynamicStack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.printStack();
        st.pop();
        st.printStack();
        st.peek();
        st.printWhileVacating();
        st.size();
    }
}

    

