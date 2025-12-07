package linkedlist.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class TraverseList {


    public List<Integer> LLTraversal(ListNode head) {
        List<Integer> res = new ArrayList<>();

        while(head != null) {
            res.add(head.data);
            head = head.next;
        }

        return res;
    }
}
