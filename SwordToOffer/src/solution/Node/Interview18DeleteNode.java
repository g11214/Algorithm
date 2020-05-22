package solution.Node;

import common.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: Tong
 * @date: 2020-05-09 20:20
 */
public class Interview18DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null || head.next == null){
            return head;
        }
        HashSet
        ListNode preNode = null;
        ListNode resNode = head;
        while(head != null){
            if(val == head.val){
                if(preNode == null){
                    return head.next;
                }else{
                    preNode.next = head.next;
                }
            }
            preNode = head;
            head = head.next;
        }
        return resNode;
    }
}
