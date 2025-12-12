package linkedlist.contest;

public class PartitionList {

    public ListNode partitionList(ListNode head, int val) {

        if (head == null || head.next == null)
            return head;

        // smaller
        ListNode dummyFirst = new ListNode(-1);
        ListNode moverFirst = dummyFirst;

        // equal or higher
        ListNode dummySecond = new ListNode(-1);
        ListNode moverSecond = dummySecond;

        while (head != null) {

            ListNode next = head.next;

            head.next = null;

            if (head.val < val) {
                moverFirst.next = head;
                moverFirst = head;
            } else {
                moverSecond.next = head;
                moverSecond = head;
            }

            head = next;
        }

        if(dummyFirst.next != null) {
            ListNode temp = dummyFirst.next;
            dummyFirst.next = null;

            moverFirst.next = dummySecond.next;

            return temp;
        } else {
            return dummySecond.next;
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
}
