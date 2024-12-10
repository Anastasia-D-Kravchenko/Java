public class MyStack {
    private Node head = null;

    public void push(int data) {
        head = new Node(data, head);
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty!"); // Handle empty stack case
        }
        int d = head.getData();
        head = head.getNext();
        return d;
    }

    public boolean empty() {
        return head == null;
    }
}