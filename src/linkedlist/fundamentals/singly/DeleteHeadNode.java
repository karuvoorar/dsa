package linkedlist.fundamentals.singly;

public class DeleteHeadNode {

    public static ListNode deleteHead(ListNode head) {

        if (head == null)
            return null;

        ListNode temp = head;

        // move head node to next
        head = temp.next;

        // make the first node as null
        temp.next = null;

        return head;
    }
}
