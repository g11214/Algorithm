package LeetCode;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/30 16:13
 * @description：给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @version: $
 */
public class Top_2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode longNode = l1;
        ListNode shortNode = l2;

        ListNode sumNode = new ListNode(0);
        ListNode preSumHead = sumNode;

        int nextWei = 0;
        int currNum = 0;

        while (longNode != null || shortNode != null) {
            currNum = 0;
            if (nextWei == 1) {
                currNum = 1;
            }
            if (shortNode == null) {
                currNum += longNode.val;
                longNode = longNode.next;
            } else if (longNode == null) {
                currNum += shortNode.val;
                shortNode = shortNode.next;
            } else {
                currNum += longNode.val + shortNode.val;
                longNode = longNode.next;
                shortNode = shortNode.next;
            }
            nextWei = 0;
            if (currNum >= 10) {
                currNum -= 10;
                nextWei = 1;
            }

            sumNode.next = new ListNode(currNum);
            sumNode = sumNode.next;
        }
        if (nextWei == 1) {
            sumNode.next = new ListNode(1);
        }

        return preSumHead.next;
    }
}
