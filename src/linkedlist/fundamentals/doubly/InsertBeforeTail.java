package linkedlist.fundamentals.doubly;

public class InsertBeforeTail {

    public ListNode insertBeforeTail(ListNode head, int X) {

        ListNode node = new ListNode(X);

        // if no node present
        if (head == null)
            return node;

        ListNode temp = head;

        // reach to tail node
        while (temp.next != null) {
            temp = temp.next;
        }

        if(temp.prev == null) {
            node.next = temp;  // connect to tail
            temp.prev = node; // connect to node from tail
            head = node;
            return head;
        }

        node.next = temp;  // connect to tail
        node.prev = temp.prev; // connect to prev node
        temp.prev.next = node; // connect to node from prev
        temp.prev = node; // connect to node from tail
        return head;
    }
}
