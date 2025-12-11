package linkedlist.hard;

public class SortLinkedList {

    public ListNode sortList(ListNode head) {

        // edge cases
        if (head == null || head.next == null) {
            return head;
        }

        // split
        ListNode mid = getMiddleNode(head);
        ListNode right = mid.next;
        mid.next = null;

        // recurrence
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);

        // merge
        return mergedNodes(leftSorted, rightSorted);
    }

    private ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode mergedNodes(ListNode leftSorted, ListNode rightSorted) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (leftSorted != null && rightSorted != null) {

            if (leftSorted.val <= rightSorted.val) {
                ListNode next = leftSorted.next;

                temp.next = leftSorted;
                leftSorted.next = null;
                temp = leftSorted;
                leftSorted = next;
            } else {
                ListNode next = rightSorted.next;

                temp.next = rightSorted;
                rightSorted.next = null;
                temp = rightSorted;
                rightSorted = next;
            }
        }

        // FIXED: attach leftover nodes
        if (leftSorted != null)
            temp.next = leftSorted;
        if (rightSorted != null)
            temp.next = rightSorted;

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