package linkedlist.fundamentals.singly;

public class SinglyLinkedList {

    static ListNode head = null;
    static ListNode tail = null;
    static int size;

    // Insert at end
    public static void insert(ListNode node) {

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

        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(2, null);
        ListNode node3 = new ListNode(3, null);
        ListNode node4 = new ListNode(4, null);
        ListNode node5 = new ListNode(5, null);

        insert(node1);

        // print 1 node
        printList();

        insert(node2);
        insert(node3);
        insert(node4);
        insert(node5);

        // print 5 nodes
        printList();

        remove(3);
        printList();

        remove(1);
        printList();

        remove(5);
        printList();

        printList();

    }

}
