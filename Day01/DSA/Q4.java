package Day01.DSA;
import java.util.*;

class stack{
    int maxsize,top;    
    int stack_arr[];
    public stack(int value){
        maxsize=value;
        top=-1;
        stack_arr=new int[maxsize];
    }

    void push(int value){
        if(top==maxsize-1){
            System.out.println("\nStack is empty.");
            return ;
        }   
        stack_arr[++top]=value;
        System.out.println("\nElement pushed is: "+value);

    }

    void pop(){
        if(top==-1){
            System.out.println("\nStack is empty.");
            return ;
        }
        int remove_value=stack_arr[top--];
        System.out.println("\nRemoved element is: "+remove_value);
    }

    void peek(){
        if(top==-1){
            System.out.println("\nStack is empty.");
            return ;
        }
        System.out.println("\nTop element is: "+stack_arr[top]);
    }

    void print(){
        for(int i=top; i>=0; i--){
            System.out.print(stack_arr[i]+" ");
        }
    }
}


class Q4{
    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.print();
        s.peek();
        s.pop();
        s.print();
        s.push(30);
        s.print();
        s.peek();
    }
}