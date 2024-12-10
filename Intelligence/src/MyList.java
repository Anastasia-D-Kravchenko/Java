//public class MyList {
//
//    private Node head;
//    public MyList() {
//        head = null; // Initialize head to null indicating an empty list.
//    }
//
//    public void addFront(int data) {
//        head = new Node(data, head); // Create a new node with data and set it as the head.
//    }
//
//    public void addBack(int data) {
//        if (head == null) {
//            addFront(data); // If list is empty, add to the front.
//            return;
//        }
//        Node tmp = head;
//        while (tmp.next != null) {
//            tmp = tmp.next; // Traverse to the last node.
//        }
//        tmp.next = new Node(data); // Create a new node and link it to the last node.
//    }
//
//    public void showList() {
//        System.out.print("[ ");
//        Node tmp = head;
//        while (tmp != null) {
//            System.out.print(tmp.data + " ");
//            tmp = tmp.next; // Traverse and print data of each node.
//        }
//        System.out.println("]");
//    }
//
//    public void showListReversed() {
//        System.out.print("[ ");
//        showRev(head); // Call the recursive helper function for reverse printing.
//        System.out.print("]");
//    }
//
//    private void showRev(Node h) {
//        if (h.next != null) {
//            showRev(h.next); // Recursively print nodes in reverse order.
//        }
//        System.out.print(h.data + " "); // Print current node's data after recursion.
//    }
//
//    public int size() {
//        int count = 0;
//        Node tmp = head;
//        while (tmp != null) {
//            count++;
//            tmp = tmp.next; // Traverse and increment count for each node.
//        }
//        return count;
//    }
//
//    public boolean empty() {
//        return head == null; // Check if head is null to determine emptiness.
//    }
//}
