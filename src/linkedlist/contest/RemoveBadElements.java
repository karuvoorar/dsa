package linkedlist.contest;

public class RemoveBadElements {

    public ListNode removeBadElements(ListNode head, int val) {

        if (head == null)
            return head;

        ListNode dummy = new ListNode(-1);
        ListNode mover = dummy;
        ListNode temp = head;

        while (temp != null) {

            ListNode next = temp.next;

            temp.next = null;

            if (temp.val != val) {
                mover.next = temp;
                mover = temp;
            }

            temp = next;
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}