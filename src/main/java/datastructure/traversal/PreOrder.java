package datastructure.traversal;

import common.TreeNode;

import java.util.Stack;

/**
 * @Description: 先序遍历
 * @Date: 2019/8/27
 **/
public class PreOrder {
    /**
     * @Description: 递归
     * @Param: [root]
     * @Return: void
     * @Date: 2019/8/27
     **/
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * @Description: 非递归;
     * @Param: [root]
     * @Return: void
     * @Date: 2019/8/27
     **/
    public void preOrderNone(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode p = null;
        //每次循环pop一次，push多次
        while (!stack.isEmpty()) {
            p = stack.pop();
            if (p != null) {
                System.out.println(p.val);
                stack.push(p.right);
                stack.push(p.left);
            }
        }
    }
}
