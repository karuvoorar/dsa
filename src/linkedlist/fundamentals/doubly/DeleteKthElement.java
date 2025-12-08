package linkedlist.fundamentals.doubly;

public class DeleteKthElement {

    public ListNode deleteKthElement(ListNode head, int k) {

        // if the list of empty then return null
        if (head == null)
            return head;

        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            ++ count;
            if (count == k)
                break;
            temp = temp.next;
        }

        // k not found
        if (temp == null) return head;

        ListNode left = temp.prev;
        ListNode right = temp.next;

        // only node
        if (left == null && right == null) {
            return null;
        }

        if (left == null) {
            // deleting head
            head = right;
            head.prev = null;
            return head;
        }

        if (right == null) {
            // deleting tail
            left.next = null;
            temp.prev = null;
            return head;
        }

        // then element is in middle
        left.next = right;
        right.prev = left;
        temp.prev = null;
        temp.next = null;

        return head;
    }
}
