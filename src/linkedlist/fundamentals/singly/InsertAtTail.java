package linkedlist.fundamentals.singly;

public class InsertAtTail {

    public ListNode insertAtTail(ListNode head, int X) {

        // create a new node
        ListNode node = new ListNode(X);

        if (head == null)
            return node;

        ListNode temp = head;

        // traverse till last
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

        return head;
    }
}
