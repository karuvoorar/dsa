package linkedlist.medium;

public class FindStartingPointOfCycle {

    public ListNode findStartingPoint(ListNode head) {

        if (head == null)
            return head;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // End of list
        if (fast == null || fast.next == null)
            return null;

        // reset slow to head
        slow = head;

        // detect where they meet
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
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