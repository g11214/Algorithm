package swordtooffer.Node;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/5 15:07
 * @description：输入两个链表，找出它们的第一个公共结点。
 * @version: $
 */
public class FindSameNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int pCount1 = 0;
        int pCount2 = 0;

        ListNode temp = pHead1;
        while (temp != null) {
            pCount1++;
            temp = temp.next;
        }
        temp = pHead2;
        while (temp != null) {
            pCount2++;
            temp = temp.next;
        }

        ListNode fast = null;
        ListNode slow = null;
        int k = 0;
        if (pCount1 == pCount2) {
            return pHead1;
        } else if (pCount1 > pCount2) {
            k = pCount1 - pCount2;
            fast = pHead1;
            slow = pHead2;
        } else {
            k = pCount2 - pCount1;
            fast = pHead2;
            slow = pHead1;
        }

        while (k != 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null && slow != null) {
            if (fast == slow) {
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
