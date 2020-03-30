package solution.Node;

import common.RandomListNode;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class CloneRandomNode {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode newNode = pHead;
        /**
         * 在原链表中插入新链表
         */
        while (newNode != null) {
            RandomListNode currNode = new RandomListNode(newNode.label);
            currNode.next = newNode.next;
            newNode.next = currNode;
            newNode = currNode.next;
        }
        /**
         * 复制随机链表属性
         */
        newNode = pHead;
        while (newNode != null) {
            if (newNode.random != null) {
                newNode.next.random = newNode.random.next;
            }
            newNode = newNode.next.next;
        }
        /**
         * 拆分出新链表
         */
        RandomListNode cloneNode = pHead.next;
        newNode = pHead;
        while (newNode.next != null) {
            RandomListNode tempNode = newNode.next;
            newNode.next = tempNode.next;
            newNode = tempNode;
        }
        return cloneNode;
    }
}
