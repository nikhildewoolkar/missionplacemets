package DSA_Problems;

public class StackImplemantation {
    int top;
    
    int arr[] = new int[1000];
    
    StackImplemantation(){
        top = -1;
    }
    
    boolean isEmpty(){
        return top < 0;
    }
    
    boolean push(int x){
        if(top >= 1000){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    
    int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = arr[top--];
            return x;
        }
    }

    public static void main(String[] args) {
        StackImplemantation s = new StackImplemantation();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
