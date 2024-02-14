import java.util.Stack;

public class stackTry {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

//        System.out.println(stack.empty());

        stack.push("Uday");
        stack.push("Sanket");
        stack.push("Kabootar");
        stack.push("Minecraft");

        stack.pop();
        stack.pop();

        System.out.println(stack);
        System.out.println("Peek: " + stack.peek()); 
//        check this code out


        stack.push("Ayush");
        stack.push("Nikhil");

        System.out.println(stack);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: false

    }

}
