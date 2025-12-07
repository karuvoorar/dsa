package linkedlist.fundamentals.singly;

public class DeleteNodeWithValueX {

    public ListNode deleteNodeWithValueX(ListNode head, int X) {

        // Return if no node is present
        if (head == null)
            return head;

        if (head.data == X)
            return head.next;

        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            if (curr.data == X) {
                prev.next = curr.next;
                curr.next = null;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}
