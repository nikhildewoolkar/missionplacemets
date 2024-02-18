import java.util.ArrayList;


class dynamicStack {
    private ArrayList<Integer> st;

    public dynamicStack(){
        st = new ArrayList<>();
    }

    public void push(int item) {
        st.add(item);
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("StackUnder flow");
        } else{
            System.out.println("Popped element" + st.remove(st.size() - 1));
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("StackUnder flow");
        } else{
            System.out.println("Popped element" + st.get(st.size() - 1));
        }
    }

    public boolean isEmpty(){
        return st.isEmpty();
    }
    public void size()
    {
        System.out.println("current stack size" + st.size());
    }
    public void printstack(){
        if(isEmpty()){
            System.out.println("stack underflow");
        }else {
            System.out.println("stack elements ");
            for (int i = st.size()-1; i>=0; i--){
                System.out.println(st.get(i)+ " ");
            }
            System.out.println();
        }
    }

    public void printWhileVacanting(){
        if (isEmpty()){
            System.out.println("stack underflow ");
        }else {
            System.out.println("printing stack while vacanting elements: ");
            for(int i = st.size()-1; i>0; i--){
                System.out.println(st.get(i)+ " ");
                st.remove(i);
            }
            System.out.println();
        }
    }
}

public class stack{
    public static void main(String[] args) {
        dynamicStack st = new dynamicStack();

        st.push(1);
        st.push(2);
        st.push(3);
       st.printstack();
        st.pop();
        st.printstack();
st.peek();
       st.printWhileVacanting();
        st.size();

    }
}

