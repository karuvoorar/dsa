package linkedlist.logic;

public class SortList {

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode zeroFirstNode = new ListNode(-1);
        ListNode oneFirstNode = new ListNode(-1);
        ListNode twoFirstNode = new ListNode(-1);

        ListNode zero = zeroFirstNode;
        ListNode one = oneFirstNode;
        ListNode two = twoFirstNode;
        ListNode temp = head;

        while (temp != null) {

            if (temp.val == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.val == 1) {
                one.next = temp;
                one = temp;
            } else if (temp.val == 2) {
                two.next = temp;
                two = temp;
            }

            temp = temp.next;
        }

        // Connect the three lists together
        zero.next = (oneFirstNode.next != null) ? oneFirstNode.next : twoFirstNode.next;
        one.next = twoFirstNode.next;
        two.next = null;

        // New head of the sorted list
        ListNode newHead = zeroFirstNode.next;

        // Delete dummy nodes
        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}