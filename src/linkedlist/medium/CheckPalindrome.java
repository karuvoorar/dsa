package linkedlist.medium;

public class CheckPalindrome {

    public boolean isPalindrome(ListNode head) {

        // edge condition
        if (head == null)
            return true;
        if (head.next == null)
            return true;

        // traverse to middle of linked list
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // if odd length, skip the middle
        if (fast != null)
            slow = slow.next;

        // reverse rest of list
        ListNode rev = slow;
        ListNode prev = null, curr = rev;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // compare original and reversed
        ListNode actual = head;
        ListNode reversedNodes = prev;

        while (actual != null && reversedNodes != null) {
            if (actual.val != reversedNodes.val)
                return false;

            actual = actual.next;
            reversedNodes = reversedNodes.next;
        }

        // if all passes then this is palindrome
        return true;
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