public class MyQueue {

    // Nested Node class for storing queue elements.
    private static class Node {
        String data;
        Node next = null;

        Node(String d) {
            data = d;
        }
    }

    private Node head, tail; // References to the head and tail of the queue.

    public MyQueue() {
        head = tail = null; // Initialize head and tail to null for an empty queue.
    }

    public void enqueue(String s) {
        Node newNode = new Node(s); // Create a new node for the element.
        if (empty()) {
            head = tail = newNode; // If empty, set both head and tail to the new node.
        } else {
            tail.next = newNode; // Link the current tail to the new node.
            tail = newNode; // Update tail to point to the newly added node.
        }
    }

    public String dequeue() {
        if (empty()) {
            throw new RuntimeException("Queue is empty!"); // Handle empty queue case.
        }
        String s = head.data;
        head = head.next; // Update head to point to the next element.
        if (head == null) { // If head becomes null after dequeue (last element), update tail to null as well.
            tail = null;
        }
        return s;
    }

    public boolean empty() {
        return head == null; // Check if head is null to determine emptiness.
    }
}