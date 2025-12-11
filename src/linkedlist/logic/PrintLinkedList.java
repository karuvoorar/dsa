package linkedlist.logic;

public class PrintLinkedList {

    public static void main(String[] args) {
        // Create a linked list with values 5, 4, 3, 7, 9 and 2
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(2);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        ListNode temp = head.next.next;

        System.out.print("Temporary Linked List: ");
        printLinkedList(temp);

        ListNode temp1 = reverseLinkedList(temp);

        System.out.print("Reversed Linked List: ");
        printLinkedList(temp1);

        System.out.print("Original Linked List: ");
        printLinkedList(head);
        System.out.print("Temporary Linked List: ");
        printLinkedList(temp);
    }

    // Function to reverse a linked list
    // using the 3-pointer approach
    public static ListNode reverseLinkedList(ListNode head) {
        /*
         * Initialize 'temp' at
         * head of linked list
         */
        ListNode temp = head;

        /*
         * Initialize pointer 'prev'
         * to NULL, representing
         * the previous node
         */
        ListNode prev = null;

        // Continue till 'temp'
        // reaches the end (NULL)
        while (temp != null) {
            /*
             * Store the next node in 'front'
             * to preserve the reference
             */
            ListNode front = temp.next;

            /*
             * Reverse the direction of the
             * current node's 'next' pointer
             * to point to 'prev'
             */
            temp.next = prev;

            /*
             * Move 'prev' to the current
             * node for the next iteration
             */
            prev = temp;

            /*
             * Move 'temp' to the 'front' node
             * advancing the traversal
             */
            temp = front;
        }

        // Return the new head
        // of the reversed linked list
        return prev;
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
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