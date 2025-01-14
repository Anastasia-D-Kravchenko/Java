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
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public static int fun(Node n) {
        int sum = n.data;
        int count = 0;
        while (n.next != null) {
            n = n.next;
            if (count < 2) {
                sum += n.data;
                count++;
            }
            count++;
        }
        return sum;
    }
}
class SinglyLL {
    Node head;
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2, n1);
        Node n3 = new Node(3, n2);
        Node n4 = new Node(4, n3);
        System.out.println(Node.fun(n4));
    }
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