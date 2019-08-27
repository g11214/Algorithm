package solution;

import common.ListNode;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class RemoveDupNode {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode addHead = new ListNode(1);
        addHead.next = pHead;
        ListNode tempHead = addHead;
        ListNode tempNode = tempHead;

        while (tempHead.next != null && tempHead.next.next != null) {
            //记录当前节点
            if (tempHead.next.val == tempHead.next.next.val) {
                //遇到重复节点
                int tempVal = tempHead.next.val;
                tempHead = tempHead.next.next;
                while (tempHead.next != null) {
                    //之后仍然重复
                    if (tempHead.next.val == tempVal) {
                        tempHead = tempHead.next;
                    } else {
                        break;
                    }
                }
                tempNode.next = tempHead.next;
            } else {
                tempHead = tempHead.next;
                tempNode = tempHead;
            }
        }
        return addHead.next;
    }
}
