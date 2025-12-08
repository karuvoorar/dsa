package linkedlist.fundamentals.doubly;

public class DeleteGivenNode {

    public void deleteGivenNode(ListNode node) {

        // If no node available return
        if (node == null)
            return;

        // temp node
        ListNode kNode = node;

        while (kNode != null) {
            if (node.data == kNode.data)
                break;
            kNode = kNode.next;
        }

        // then the node is not present
        if (kNode == null)
            return;

        // left and right node
        ListNode left = kNode.prev;
        ListNode right = kNode.next;

        // then we have only one node
        if (left == null && right == null) {
            node = null;
            return;
        }

        // Remove Head Node
        if (left == null) {
            node = node.next;       // assign next node
            node.prev.next = null;  // remove connection to next node
            node.prev = null;       // remove connection to prev node
            return;
        }

        // Remove Tail Node
        if (right == null) {
            kNode.prev.next = null;
            kNode.prev = null;
            return;
        }

        // middle node
        left.next = right; // connect the left node to next node of temp
        right.prev = kNode.prev; // connect the right node to prev node of temp
        kNode.prev = null; // make prev conn in temp node as null
        kNode.next = null; // make next conn in temp node as null
    }
}
