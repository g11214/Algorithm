package solution.linkedlist;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/16 9:40
 * @description：
 * @version: $
 */
public class Top_141HasCycle {
    public boolean solution(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
