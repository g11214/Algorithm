package traversal;

import common.TreeNode;

import java.util.Stack;

public class InOrder {
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    /**
     * @Description: 非递归
     * @Param: [root]
     * @Return: void
     * @Date: 2019/8/27
     **/
    public void inOrderNone(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }
}
