package linkedlist.logic;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        // Move fast reference to the nth node
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // means the nth node is end
        if (fast == null) {
            return head.next;
        }

        // Move fast to tail
        // Move slow to prev node
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
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