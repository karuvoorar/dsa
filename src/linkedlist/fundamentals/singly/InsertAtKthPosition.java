package linkedlist.fundamentals.singly;

public class InsertAtKthPosition {

    public ListNode insertAtKthPosition(ListNode head, int X, int K) {

        // create the node
        ListNode node = new ListNode(X);

        // if the insert is at first position
        if (K == 1) {
            node.next = head;
            head = node;
            return head;
        }

        ListNode prev = head;
        ListNode curr = head;

        for (int i = 1; i < K && curr != null; i++) {
            prev = curr;
            curr = curr.next;
        }

        // if the current node is last node
        if (curr == null) {
            prev.next = node;
            return head;
        }

        node.next = curr;
        prev.next = node;

        return head;
    }
}
