package linkedlist.fundamentals.singly;

public class ArrayToList {

    public static void main(String[] args) {
        int[] array = new int[] { 12, 3, 4, 5, 6, 7, 7 };

        ListNode ll = convertArrayToList(array);

        while (ll.next != null) {
            System.out.println(ll.data);
            ll = ll.next;
        }
    }

    private static ListNode convertArrayToList(int[] array) {
        ListNode head = new ListNode(array[0], null);
        ListNode tail = head;
        for (int i = 1; i < array.length; i++) {
            ListNode temp = new ListNode(array[i], null);
            tail.next = temp;
            tail = temp;
        }

        return head;
    }
}
