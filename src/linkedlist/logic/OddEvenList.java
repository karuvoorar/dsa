package linkedlist.logic;

public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenFirstNode = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;   // move odd pointer
            even.next = even.next.next; // move even pointer
            odd = odd.next;             // move the odd to next node
            even = even.next;           // move the even to next node
        }

        // now point the even node after odd
        odd.next = evenFirstNode;

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