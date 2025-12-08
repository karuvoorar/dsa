package linkedlist.fundamentals.doubly;

public class InsertBeforeHead {

    public ListNode insertBeforeHead(ListNode head, int data) {

        ListNode node = new ListNode(data);

        // in-case of no data in node
        if (head == null)
            return node;

        node.next = head;
        head.prev = node;
        head = node;

        return head;
    }
}
