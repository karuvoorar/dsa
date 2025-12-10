package linkedlist.doubly;

public class RemoveDuplicates {

    public ListNode removeDuplicates(ListNode head) {

        // edge case
        if(head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if(prev.val == curr.val) {
                // if the node is in tail
                if(curr.next == null) {
                    prev.next = null;
                    curr.prev = null;
                    curr = null;
                    continue;
                }

                // if it is in middle node
                prev.next = curr.next;
                curr.next.prev = prev;
                curr.prev = null;
                curr.next = null;
                curr = prev.next;
                continue;
            }

            // move the pointers
            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}