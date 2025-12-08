package linkedlist.fundamentals.doubly;

public class InsertBeforeGivenNode {

    public void insertBeforeGivenNode(ListNode node, int X) {

        ListNode prevNode = node.prev;
        ListNode curr = node;

        // create a new node
        ListNode newNode = new ListNode(X, prevNode, curr);

        // map it's node
        prevNode.next = newNode;
        curr.prev = newNode;
    }
}
