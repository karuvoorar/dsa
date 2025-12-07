package linkedlist.fundamentals.singly;

public class ListNode {

    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }


    public ListNode(int data, ListNode node) {
        this.data = data;
        this.next = node;
    }
}
