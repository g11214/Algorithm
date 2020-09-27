package solution;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/15 17:37
 * @description： 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * @version: $
 */
public class Top_234IsPalindrome {
    /**
     * @Description: 参考反转链表做法
     * @Param: [head]
     * @Return: boolean
     * @Date: 2020/4/16
     **/
    public boolean solution(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fastNode = head;

        ListNode preNode = null;
        ListNode currNode = head;
        ListNode nextNode = head.next;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;

            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }

        //节点为奇数情况
        if (fastNode != null) {
            currNode = nextNode;
        }
        while (preNode != null) {
            if (preNode.val != currNode.val) {
                return false;
            }
            preNode = preNode.next;
            currNode = currNode.next;
        }
        return true;
    }
}
