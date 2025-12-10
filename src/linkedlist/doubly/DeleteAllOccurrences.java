package linkedlist.doubly;

public class DeleteAllOccurrences {

    public ListNode deleteAllOccurrences(ListNode head, int target) {

        // edge case
        if (head == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;

        // handle cases here
        while (curr != null) {

            if (curr.val == target) {

                // Head deletion
                if (curr == head) {
                    head = head.next; // move the actual head
                    if (head != null)
                        head.prev = null; // make the head prev ref to null

                    curr = head;
                    continue;
                }

                // tail deletion
                if (curr.next == null) {
                    prev.next = null;
                    curr.prev = null;
                    curr = null;
                    continue;
                }

                // middle deletion
                prev.next = curr.next;
                curr.next.prev = prev;
                curr.prev = null;
                curr.next = null;

                curr = prev.next; // IMP: bcs we need to adjust next node
                continue;
            }

            // assign this only in case of deletion skip
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