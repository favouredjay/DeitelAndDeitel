package Chapter16;

public class Stack {

    public static void printStack(java.util.Stack<Number> stack){

        System.out.println(stack.isEmpty()? "stack is empty" : "Stack contains " + stack);
    }

    public static void main(String[] args) {
        java.util.Stack<Number> stack= new java.util.Stack<>();
        stack.push(10L);
        stack.push(123);
        stack.push(2);
        stack.add(0, 8);
        printStack(stack);
        System.out.println(stack.peek());
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        stack.remove(0);
        printStack(stack);
    }
}
