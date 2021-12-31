package stacknqueue;

public class StackDriver {

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(8);
        stack.push(12);
        stack.push(25);
        stack.push(98);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();

        System.out.println(stack.peek());
        stack.pop();

    }
}
