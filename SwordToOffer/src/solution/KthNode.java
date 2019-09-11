package solution;

import common.TreeNode;

import java.util.Stack;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/11 16:47
 * @description：给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * @version: $
 */
public class KthNode {

    TreeNode kthNode(TreeNode pRoot, int k) {
        Stack<TreeNode> stack = new Stack();
        stack.push(pRoot);
        TreeNode tempNode = pRoot;
        int index = 0;
        while (!stack.isEmpty() && pRoot != null) {
            while (tempNode.left != null) {
                stack.push(tempNode.left);
                tempNode = tempNode.left;
            }
            tempNode = stack.pop();
            index++;
            if(k==index){
                return tempNode;
            }

            if (tempNode.right != null) {
                stack.push(tempNode.right);
                tempNode = tempNode.right;
            } else {
                tempNode.left = null;
            }
        }
        return null;
    }
}
