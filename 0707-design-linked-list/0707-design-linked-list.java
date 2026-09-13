class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    // Add node at head
    public void addAtHead(int val) {

        Node nn = new Node(val);

        nn.next = head;
        head = nn;

        size++;
    }

    // Add node at tail
    public void addAtTail(int val) {

        Node nn = new Node(val);

        if (head == null) {
            head = nn;
            size++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = nn;

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index > size) {
            return;
        }

        // Insert at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node nn = new Node(val);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        nn.next = temp.next;
        temp.next = nn;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }
}