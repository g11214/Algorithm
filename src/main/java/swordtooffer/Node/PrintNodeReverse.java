package swordtooffer.Node;

import common.ListNode;

import java.util.ArrayList;

/**
 * @description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author: Tong
 * @date: 2020-03-23 20:43
 */
public class PrintNodeReverse {
    public ArrayList<Integer> solution(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (listNode != null) {
            list = solution(listNode.next);
            list.add(listNode.val);
            return list;
        }
        return list;
    }
}
