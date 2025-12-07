package linkedlist.fundamentals.singly;

public class InsertBeforeX {

    public ListNode insertBeforeX(ListNode head, int X, int val) {

        // create a node
        ListNode node = new ListNode(val);

        // If the value is in first index
        if (head != null && head.data == X) {
            node.next = head;
            head = node;
            return head;
        }

        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {

            // if the current node has actual value
            if (curr.data == X) {
                node.next = curr;
                prev.next = node;
                return head;
            }

            // else move pointer
            prev = curr;
            curr = curr.next;
        }

        return head;

    }
}
