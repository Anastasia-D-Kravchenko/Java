public class ArrStack {
    private int[] elems;
    private int top = 0;

    public ArrStack(int maxSize) {
        elems = new int[maxSize]; // Allocate an array with the specified maximum size.
    }

    public void push(int e) {
        // Check for stack overflow (full stack) before pushing.
        if (top == elems.length) {
            throw new RuntimeException("Stack overflow!");
        }
        elems[top++] = e; // Push element to the top and increment top.
    }

    public int pop() {
        // Check for underflow (empty stack) before popping.
        if (empty()) {
            throw new RuntimeException("Stack underflow!");
        }
        return elems[--top]; // Return element and decrement top.
    }

    public boolean empty() {
        return top == 0; // Check if top is at the beginning (empty stack).
    }
}