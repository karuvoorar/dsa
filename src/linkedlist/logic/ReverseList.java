package linkedlist.logic;

public class ReverseList {

    public ListNode reverseList(ListNode head) {

        // base condition
        if (head == null || head.next == null)
            return head;

        // Create a dummy node
        ListNode resultNode = new ListNode(-1);

        // traverse and add node to list
        while (head != null) {

            // put the next node or null as next.
            ListNode next = head.next;

            // segregate the obtained node
            ListNode temp = head;
            temp.next = null;

            // add node to result
            temp.next = resultNode.next;
            resultNode.next = temp;

            // move next
            head = next;
        }

        // finally return result
        return resultNode.next;
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