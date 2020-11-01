package SwordToOffer.Node;

import common.ListNode;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class RemoveDupNode {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode addHead = new ListNode(1);
        addHead.next = pHead;
        ListNode lastNode = addHead;

        while (lastNode.next != null && lastNode.next.next != null) {
            ListNode currNode = lastNode.next;
            ListNode nextNode = currNode.next;

            if (currNode.val == nextNode.val) {
                //遇到重复节点
                int dupVal = currNode.val;
                ListNode conNode = nextNode;
                while (conNode.next != null && conNode.next.val == dupVal) {
                    //之后仍然重复
                    conNode = conNode.next;
                }
                lastNode.next = conNode.next;
            } else {
                lastNode = lastNode.next;
            }
        }
        return addHead.next;
    }
}
