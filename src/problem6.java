public class problem6 {

    public static void main(String[] args)
    {
        ArrayStack<Integer> stack = new ArrayStack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.reverseStack();
        stack.printStack();

        // Time complexity is
    }
}
