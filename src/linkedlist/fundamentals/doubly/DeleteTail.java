package linkedlist.fundamentals.doubly;

public class DeleteTail {

    public ListNode deleteTail(ListNode head) {

        if (head == null)
            return null;

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        if (temp.prev == null)
            return null;

        temp.prev.next = temp.prev = null;

        return head;
    }
}
