package linkedlist.hard;

public class MergeSortedLinkedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // edge cases
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null && list2 != null)
            return list2;
        if (list1 != null && list2 == null)
            return list1;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val > list2.val) {
                ListNode nextList2 = list2.next;

                list2.next = null;  // make list2 isolated
                temp.next = list2;  // assign list2 to temp
                temp = list2;       // move temp to next node
                list2 = nextList2;  // new list2 will be it's next
                continue;
            } else if (list1.val < list2.val) {
                ListNode nextList1 = list1.next;

                list1.next = null;  // make list1 isolated
                temp.next = list1;  // assign list1 to temp
                temp = list1;       // move temp to next node
                list1 = nextList1;  // new list1 will be it's next
                continue;
            }

            // else both are equal
            ListNode nextList1 = list1.next;
            ListNode nextList2 = list2.next;

            list2.next = null;  // make list2 isolated
            list1.next = null;  // make list1 isolated
            list1.next = list2; // attach list2 to list1
            temp.next = list1;  // attach temp's next to list1
            temp = list2;       // temp to list2
            list2 = nextList2;  // new list2 will be it's next
            list1 = nextList1;  // new list1 will be it's next
        }

        // check for the list1 not being reached end
        while (list1 != null) {
            ListNode next = list1.next;
            temp.next = list1;
            temp = list1;
            list1 = next;
        }

        // check for the list2 not being reached end
         while (list2 != null) {
            ListNode next = list2.next;
            temp.next = list2;
            temp = list2;
            list2 = next;
        }

        return dummy.next;
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