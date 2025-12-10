package linkedlist.medium;

public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // edge condition
        if (headA == null || headB == null)
            return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2) {

            // move next
            temp1 = temp1.next;
            temp2 = temp2.next;

            // check if both nodes are same
            if(temp1 == temp2) return temp1;

            // if any of node reaches end, then move to next node.
            if(temp1.next == null) temp1 = headB;
            if(temp2.next == null) temp2 = headA;
        }

        return temp1;
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