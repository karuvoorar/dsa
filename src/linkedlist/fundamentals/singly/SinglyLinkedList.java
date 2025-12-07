package linkedlist.fundamentals.singly;

public class SinglyLinkedList {

    static ListNode head = null;
    static ListNode tail = null;
    static int size;

    public static void insertHead(ListNode node) {
        // if it's first then add as head
        if (head == null) {
            head = node;
            tail = node;
            ++size;
            return;
        }

        // insert at first
        node.next = head;
        head = node;
        ++size;
    }

    // Insert at end
    public static void insertTail(ListNode node) {

        // if it's first then add as head
        if (head == null) {
            head = node;
            tail = node;
            ++size;
            return;
        }

        // else insert at end
        tail.next = node;
        tail = node;
        ++size;
    }

    // Insert at specific position
    public static void insertAt(ListNode node, int index) {

        if (size == 0 || index == 0) {
            insertHead(node);
            return;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        for (int i = 1; i < index && curr != null; i++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = node;
        node.next = curr;
        ++size;

        // if the index is big then add at last
        if (curr == null) tail = node;
    }

    // Delete a node
    public static void remove(int data) {

        // base condition
        if (size == 0)
            return;

        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            if (curr.data == data) {
                if (curr == head) {
                    head = head.next;
                } else {
                    prev.next = curr.next;
                }
                --size;
            }

            prev = curr;
            curr = curr.next;
        }
    }

    // Traverse a node and find the value is found

    // print linked list
    public static void printList() {

        System.out.println("Printing List of size " + size);
        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode node0 = new ListNode(0, null);
        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(2, null);
        ListNode node3 = new ListNode(3, null);
        ListNode node4 = new ListNode(4, null);
        ListNode node5 = new ListNode(5, null);

        insertTail(node1);

        // print 1 node
        printList();

        insertTail(node2);
        insertTail(node3);
        insertTail(node4);
        insertTail(node5);

        // print 5 nodes
        printList();

        remove(3);
        printList();

        insertHead(node0);
        printList();

        insertAt(node3, 5);
        printList();
    }

}
