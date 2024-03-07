public class Solution {
     private ListNode findMiddle(ListNode slow, ListNode fast) {
        if (fast == null || fast.next == null) {
            return slow;
        }

        return findMiddle(slow.next, fast.next.next);
    }
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        return findMiddle(head, head);
    }

   
}
