package linkedlist.contest;

public class SegregateLinkedList {

    public ListNode segregateLinkedList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode dummyZero = new ListNode(-1);
        ListNode moverZero = dummyZero;

        ListNode dummyOne = new ListNode(-1);
        ListNode moverOne = dummyOne;

        ListNode dummyTwo = new ListNode(-1);
        ListNode moverTwo = dummyTwo;

        int count = 0;

        while (head != null) {

            ++count;
            ListNode next = head.next;
            head.next = null;

            int rem = count % 3;

            if (rem == 0) {
                moverZero.next = head;
                moverZero = head;
            } else if (rem == 1) {
                moverOne.next = head;
                moverOne = head;
            } else if (rem == 2) {
                moverTwo.next = head;
                moverTwo = head;
            }

            head = next;
        }

        ListNode dummyRes = new ListNode(-1);
        ListNode mover = dummyRes;

        if (dummyZero.next != null) {
            mover.next = dummyZero.next;
            mover = moverZero;
        }

        if (dummyOne.next != null) {
            mover.next = dummyOne.next;
            mover = moverOne;
        }

        if (dummyTwo.next != null) {
            mover.next = dummyTwo.next;
            mover = moverTwo;
        }

        return dummyRes.next;
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