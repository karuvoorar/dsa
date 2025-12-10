package linkedlist.medium;

public class LengthOfCycle {

    public int findLengthOfLoop(ListNode head) {

        // find if that's a loop
        if (head == null)
            return 0;

        ListNode slow = head, fast = head;
        boolean isCycle = false;

        // detect the cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        // if that is not cycle return 0
        if (!isCycle)
            return 0;

        // find start of cycle
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // both slow and fast are at starting point
        // traverse only the fast for one cycle
        int count = 1;
        fast = fast.next;

        while (slow != fast) {
            ++count;
            fast = fast.next;
        }

        // we now know the count
        return count;

    }
}
