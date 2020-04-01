package Top1To10;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/30 16:13
 * @description：
 * @version: $
 */
public class Top_2addTwoNumbers {
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
