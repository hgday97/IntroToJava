package Intermediate;

import java.util.Stack;

public class StackDemo {  // Stacks are LIFO - Last in, First out
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("America");  // Initialising the stack
        stack.push("Germany");
        stack.push("Italy");

        System.out.println("Stack: " + stack);

        while (!stack.isEmpty()) {
            String poppedElement = stack.pop();  // Pops off top element of stack (right most element in the "list")
            System.out.println("Popped Element: " + poppedElement + ", original position in stack: " + stack.size());
        }
    }
}
