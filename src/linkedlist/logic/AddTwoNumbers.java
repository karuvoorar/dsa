package linkedlist.logic;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultList = new ListNode(l1.val + l2.val);
        l1 = l1.next;
        l2 = l2.next;

        ListNode temp = resultList;

        while (l1 != null || l2 != null) {
            int opr1 = 0;

            if (l1 != null) {
                opr1 = l1.val; // fetch value
                l1 = l1.next; // move to next
            }

            int opr2 = 0;

            if (l2 != null) {
                opr2 = l2.val; // fetch value
                l2 = l2.next; // move to next
            }

            // append the new node to list
            ListNode newNode = new ListNode(opr1 + opr2);
            temp.next = newNode;
            temp = newNode;
        }

        return resultList;
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