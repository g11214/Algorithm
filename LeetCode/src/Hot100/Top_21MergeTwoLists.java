package Hot100;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/13 16:52
 * @description： 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @version: $
 */
public class Top_21MergeTwoLists {
    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode iter1 = l1;
        ListNode iter2 = l2;

        ListNode headNode = new ListNode(-1);
        ListNode resNode = headNode;
        while (iter1 != null || iter2 != null) {
            if (iter1 == null) {
                headNode.next = iter2;
                break;
            } else if (iter2 == null) {
                headNode.next = iter1;
                break;
            } else {
                if (iter1.val > iter2.val) {
                    headNode.next = new ListNode(iter2.val);
                    iter2 = iter2.next;
                }else{
                    headNode.next = new ListNode(iter1.val);
                    iter1 = iter1.next;
                }
                headNode = headNode.next;
            }
        }
        return resNode.next;
    }

    public ListNode solution2(ListNode iter1, ListNode iter2) {
        ListNode currNode;
        if (iter1 == null) {
            return iter2;
        } else if (iter2 == null) {
            return iter1;
        } else {
            if (iter1.val > iter2.val) {
                currNode = new ListNode(iter2.val);
                currNode.next = solution2(iter1,iter2.next);
            }else{
                currNode = new ListNode(iter1.val);
                currNode.next = solution2(iter1.next,iter2);
            }
        }
        return currNode;
    }
}
