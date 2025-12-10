package linkedlist.logic;

public class ReverseLinkedListRecursive {

    public ListNode reverseList(ListNode head) {

        // base condition
        if(head == null || head.next == null) return head;

        // recurrence relation
        ListNode ans = reverseList(head.next);

        // point the head backwards
        head.next.next = head;
        head.next = null;

        return ans;
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
