public class heapAndStack {
    int data;
    heapAndStack next;
    heapAndStack(int data, heapAndStack next) {
        this.data = data;
        this.next = next;
    }
    heapAndStack(int data) {
        this(data,null);
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        str.append(data + " ");
        while (next != null) {
            str.append(next.data + " ");
            next = next.next;
        }
        str.append("]");
        return str.toString();
    }
    int getData() { return data; }
    heapAndStack getNext() { return next; }
}

class heap {
    public static void main(String[] args) {
        heapAndStack heap = new heapAndStack(10);
        System.out.println(heap);
        heap = new heapAndStack(11, heap);
        heap = new heapAndStack(21, heap);
        System.out.println(heap.data);
        System.out.println(heap.getData());
        System.out.println(heap.getNext());
        heap = new heapAndStack(31, heap);
        heap = new heapAndStack(41, heap);
        System.out.println(heap);
    }
}
