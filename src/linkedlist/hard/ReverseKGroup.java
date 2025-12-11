package linkedlist.hard;

public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        // handle edge cases
        if (k == 0)
            return head;
        if (head == null)
            return head;

        ListNode temp = head;

        ListNode res = new ListNode(-1);
        ListNode mover = res;

        while (temp != null) {

            // fetch nodes for reversal
            // after result the temp still points to first node
            // (if reversed last node in result)
            ListNode toReverse = getKNode(temp, k);

            if (toReverse == null) {
                mover.next = temp;
                return res.next;
            }

            ListNode reversed = reverseList(toReverse);
            mover.next = reversed;

            // move mover to end of reversed block
            while (mover.next != null)
                mover = mover.next;

            temp = nextStart;
        }

        return res.next;

    }

    private ListNode nextStart;

    private ListNode getKNode(ListNode head, int k) {

        ListNode temp = head;

        ListNode res = new ListNode(-1);
        ListNode mover = res;

        while (temp != null && k > 0) {
            --k;

            // fetch the next node
            ListNode nextNode = temp.next;

            // cut off temp node
            temp.next = null;

            // add mover's next node as temp
            mover.next = temp;

            // assign the last node
            mover = temp;

            // now assign temp to nextNode
            temp = nextNode;
        }

        if (k == 0) {
            nextStart = temp;
            return res.next;
        }

        return null;
    }

    private ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode res = null;

        while (temp != null) {

            // fetch the next node
            ListNode nextNode = temp.next;

            // assigning the object of result to next of temp
            temp.next = res;

            // point res to temp node
            res = temp;

            // assign temp reference to next node
            temp = nextNode;
        }

        return res;
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
