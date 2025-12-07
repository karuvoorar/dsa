package linkedlist.fundamentals.singly;

public class DeleteTailNode {
    public ListNode deleteTail(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode prev = head;
        ListNode curr = head;

        // traverse till end
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

        return head;
    }
}
