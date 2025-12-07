package linkedlist.fundamentals.singly;

public class DeleteKthElement {

    public ListNode deleteKthNode(ListNode head, int k) {

        if (head == null)
            return null;

        if (k == 1)
            return head.next;

        ListNode prev = head;
        ListNode curr = head;

        // traverse till the kth element as curr
        for (int i = 1; i < k && curr != null; i++) {
            prev = curr;
            curr = curr.next;
        }

        // fix: if k is out of bounds
        if (curr == null)
            return head;

        prev.next = curr.next;
        curr.next = null;

        return head;
    }
}
