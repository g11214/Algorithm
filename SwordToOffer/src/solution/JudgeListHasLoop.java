package solution;

import common.ListNode;

import java.util.HashSet;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class JudgeListHasLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null) {
            return null;
        }
        HashSet<ListNode> nodeHashSet = new HashSet<>();
        while (pHead != null) {
            if (!nodeHashSet.add(pHead)) {
                return pHead;
            }
            pHead = pHead.next;
        }
        return null;
    }
}
