class SortedSLL {
    Node head;
    public void addSorted(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            if (newNode.data <= head.data) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null && current.next.data < newNode.data) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
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
class NodeOperations {
    public static Node arrayToList(int[] arr) {
        Node head = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            Node newNode = new Node(arr[i]);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    public static Node[] extract(Node head) {
        Node evenHead = null, oddHead = null, evenTail = null, oddTail = null;
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = current.next;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }
        if (oddTail != null) {
            oddTail.next = null;
        }
        return new Node[]{evenHead, oddHead};
    }
    public static void showList(Node head) {
        Node current = head;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }
}