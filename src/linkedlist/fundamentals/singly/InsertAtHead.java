package linkedlist.fundamentals.singly;

public class InsertAtHead {

    public ListNode insertAtHead(ListNode head, int X) {

        ListNode node = new ListNode(X);

        if (head == null) return node;

        node.next = head;
        head = node;

        return head;
    }
}
