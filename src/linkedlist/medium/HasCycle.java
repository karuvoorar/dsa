package linkedlist.medium;

public class HasCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null)
            return false;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            // move slow ref to one position
            slow = slow.next;
            // move fast ref to two position
            fast = fast.next.next;
            // if both slow and fast are same, then it is a cycle
            if (slow == fast)
                return true;
        }

        return false;

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