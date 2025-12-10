package linkedlist.logic;

public class ReverseLinkedListTemplate {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) { // traverse till end

            ListNode next = curr.next; // provide reference to next node

            curr.next = prev; // assign to prev object
            prev = curr; // point prev reference to temporary object
            curr = next; // assign curr to next object
        }

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
