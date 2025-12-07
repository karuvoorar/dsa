package linkedlist.fundamentals.doubly;

public class ListNode {

    int data;
    ListNode prev;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
