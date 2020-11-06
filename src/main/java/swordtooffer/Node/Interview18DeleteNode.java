package swordtooffer.Node;

import common.ListNode;

/**
 * @description:
 * @author: Tong
 * @date: 2020-05-09 20:20
 */
public class Interview18DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode resNode = head;
        while (head != null) {
            if (val == head.val) {
                if (preNode == null) {
                    return head.next;
                } else {
                    preNode.next = head.next;
                }
            }
            preNode = head;
            head = head.next;
        }
        return resNode;
    }
}
