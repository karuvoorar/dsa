package linkedlist.hard;

public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;

        // take the length of linkedlist
        int count = 1;

        while (temp.next != null) {
            ++count;
            temp = temp.next;
        }

        // connect the last node to first node
        temp.next = head;

        // If the k is greater than length
        k = k % count;
        // To get end of the list
        int end = count - k;
        while (end-- > 0)
            temp = temp.next;

        // Breaking last node link and pointing to NULL
        head = temp.next;
        temp.next = null;

        return head;

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