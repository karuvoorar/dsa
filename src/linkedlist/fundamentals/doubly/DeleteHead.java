package linkedlist.fundamentals.doubly;

public class DeleteHead {

    public ListNode deleteHead(ListNode head) {

        if (head == null)
            return null;

        head = head.next;
        head.prev = null;
        return head;
    }
}
