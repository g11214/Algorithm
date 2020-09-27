package solution;

import common.ListNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/14 15:57
 * @description：
 * @version: $
 */
public class Top_160GetIntersectionNode {
    public ListNode solution(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        ListNode iterA = headA;
        ListNode iterB = headB;

        while (iterA != null) {
            countA++;
            iterA = iterA.next;
        }
        while (iterB != null) {
            countB++;
            iterB = iterB.next;
        }
        ListNode fastNode, slowNode;
        if (countA > countB) {
            slowNode = headB;
            fastNode = headA;
        } else {
            slowNode = headA;
            fastNode = headB;
        }
        int count = 0;
        while (fastNode != null && slowNode != null) {
            if (++count < Math.abs(countA - countB)+1) {
                fastNode = fastNode.next;
                continue;
            } else {
                if (fastNode == slowNode) {
                    return fastNode;
                } else {
                    fastNode = fastNode.next;
                    slowNode = slowNode.next;
                }
            }

        }
        return null;
    }

    public ListNode solution2(ListNode headA, ListNode headB){
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
