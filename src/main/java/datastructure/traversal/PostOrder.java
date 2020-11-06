package datastructure.traversal;

import common.TreeNode;

import java.util.Stack;

public class PostOrder {
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val);
        }
    }

    public void postOrderNone(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode tempNode = root;
        while (!stack.isEmpty()) {
            while (tempNode.right != null) {
                stack.push(tempNode.right);
                tempNode = tempNode.right;
            }

        }

    }
}
