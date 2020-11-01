package LeetCode;

import common.ListNode;

import java.util.ArrayDeque;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/3 14:12
 * @description：
 * @version: $
 */
public class Top_20ReverseList {
    public ListNode solution(ListNode head) {
        if (head != null && head.next != null) {
            ListNode newHeadNode = solution(head.next);
            head.next.next = head;
            head.next = null;
            return newHeadNode;
        }
        return head;
    }


    public ListNode solution1(ListNode head) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode preNewHead = new ListNode(0);
        ListNode newHead = preNewHead;
        while (!stack.isEmpty()) {
            preNewHead.next = new ListNode(stack.pop());
            preNewHead = preNewHead.next;
        }
        return newHead.next;
    }


    public ListNode solution2(ListNode head) {
        ListNode preNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        return preNode;
    }

}
