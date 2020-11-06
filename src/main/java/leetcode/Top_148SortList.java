package leetcode;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/9 15:01
 * @description： 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * 示例 2:
 * <p>
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 * @version: $
 */
public class Top_148SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //先归
        //取中点
        ListNode midNode = middleNode(head);
        ListNode rightNode = midNode.next;
        midNode.next = null;//链表中点处断开
        //递归取至最小
        ListNode left = sortList(head);
        ListNode right = sortList(rightNode);

        //再并
        return sort2List(left, right);
    }

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode sort2List(ListNode left, ListNode right) {
        ListNode headNode = new ListNode(-1);
        ListNode resNode = headNode;

        while (left != null && right != null) {
            if (left.val < right.val) {
                headNode.next = new ListNode(left.val);
                left = left.next;
            } else {
                headNode.next = new ListNode(right.val);
                right = right.next;
            }
            headNode = headNode.next;
        }

        while (left != null) {
            headNode.next = new ListNode(left.val);
            headNode = headNode.next;
            left = left.next;
        }

        while (right != null) {
            headNode.next = new ListNode(right.val);
            headNode = headNode.next;
            right = right.next;
        }

        return resNode.next;
    }
}
