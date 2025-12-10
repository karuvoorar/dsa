package linkedlist.medium;

public class AddOne {

    public ListNode addOne(ListNode head) {

        if (head == null)
            return head;

        int carry = addOneHelper(head);

        if (carry == 1) {
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    private int addOneHelper(ListNode head) {
        // base condition
        if (head == null)
            return 1;

        int carry = addOneHelper(head.next);

        int currValue = head.val + carry;

        if (currValue == 10) {
            head.val = 0;
            return 1;
        }

        head.val = currValue;
        return 0;
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