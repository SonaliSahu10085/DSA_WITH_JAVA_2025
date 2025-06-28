public class LinkedList {

    // creating node class
    public class Node {
        int data;
        Node next;

        // parameterized constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public int size() {
        int sz = 0;
        for (Node temp = head; temp != null; temp = temp.next) {
            sz++;
        }
        return sz;
    }

    // basic operations of ll
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        if (idx == size() - 1) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;

    }

    public int getFirst() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        return head.data;
    }

    public int getLast() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        return tail.data;
    }

    public int get(int idx) {
        if (idx == 0) {
            return getFirst();
        }

        if (idx == size() - 1) {
            return getLast();
        }

        Node curr = head;
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }

        return curr.data;

    }

    public void set(int idx, int data) {
        if (head == null) {
            return;
        }

        Node curr = head;
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }
        curr.data = data;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }

        Node prev = head;
        for (int i = 0; i < size() - 2; i++) {
            prev = prev.next;
        }

        int data = tail.data;
        prev.next = null;
        tail = prev;

        return data;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is Empty!");
            return;
        }

        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data + "->");
        }

        System.out.println("null");
    }
    // public int remove(int idx) {
    // if (head == null) {
    // System.out.println("LinkedList is empty");
    // return Integer.MIN_VALUE;
    // }
    // 
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(90);
        ll.addLast(100);
        ll.add(1, 95);
        ll.print();
    }
}

