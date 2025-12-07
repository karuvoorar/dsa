package linkedlist.fundamentals.doubly;

import java.util.List;

public class ArrayToDoublyLinkedList {

    public static ListNode arrayToDoublyLinkedList(List<Integer> arr) {

        // if no data in list
        // then return null
        if (arr.size() == 0)
            return null;

        ListNode head = new ListNode(arr.get(0));
        ListNode tail = head;

        for (int i = 1; i < arr.size(); i++) {
            // create a new node
            ListNode node = new ListNode(arr.get(i), tail, null);

            //node.prev = tail;
            tail.next = node;
            tail = node;
        }

        return head;
    }

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        // Function call to convert an array to a doubly linked list
        ListNode head = arrayToDoublyLinkedList(nums);

        // Print forward
        System.out.println("Forward:");
        ListNode curr = head;
        ListNode tail = null;

        while (curr != null) {
            System.out.println(curr.data);
            if (curr.next == null)
                tail = curr; // capture tail
            curr = curr.next;
        }

        // Print reverse
        System.out.println("Reverse:");
        while (tail != null) {
            System.out.println(tail.data);
            tail = tail.prev;
        }

    }
}
