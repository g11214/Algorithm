package test;

import common.ListNode;
import solution.RemoveDupNode;

public class NewTest {
    public static void main(String[] args){
        RemoveDupNode removeDupNode = new RemoveDupNode();
        ListNode newListNode1 = new ListNode(1);
        ListNode newListNode2 = new ListNode(2);
        ListNode newListNode3 = new ListNode(3);
        ListNode newListNode4 = new ListNode(3);
        ListNode newListNode5 = new ListNode(4);
        ListNode newListNode6 = new ListNode(4);
        ListNode newListNode7 = new ListNode(5);

        newListNode1.next = newListNode2;
        newListNode2.next = newListNode3;
        newListNode3.next = newListNode4;
        newListNode4.next = newListNode5;
        newListNode5.next = newListNode6;
        newListNode6.next = newListNode7;
        newListNode7.next = null;

        ListNode t = removeDupNode.deleteDuplication(newListNode1);
        while(t!=null){
            System.out.println(t.val);
            t=t.next;
        }
    }
}
