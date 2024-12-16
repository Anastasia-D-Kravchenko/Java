////public class Node {
////    int data;
////    Node next;
////
////    Node(int data, Node next) {
////        this.data = data;
////        this.next = next;
////    }
////
////    Node(int data) {
////        this(data, null);
////    }
////}
//public class Node {
//    private int data;
//    private Node next;
//
//    Node(int data, Node next) {
//        this.data = data;
//        this.next = next;
//    }
//
//    Node(int data) {
//        this(data, null);
//    }
//
//    int getData() {
//        return data;
//    }
//
//    Node getNext() {
//        return next;
//    }
//}

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLL {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void show() {
        Node current = head;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }
}