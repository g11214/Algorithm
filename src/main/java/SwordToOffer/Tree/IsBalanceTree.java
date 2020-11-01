package SwordToOffer.Tree;

import common.TreeNode;

/**
 * @description: 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 * @author: Tong
 * @date: 2020-03-25 15:19
 */
public class IsBalanceTree {
    public boolean solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        int rootLeftDepth = getDepth(root.left);
        int rootRightDepth = getDepth(root.right);
        if (Math.abs(rootLeftDepth - rootRightDepth) > 1) {
            return false;
        }
        return solution(root.left) && solution(root.right);
    }

    //树的高度
    public int getDepth(TreeNode treeNode) {
        if (treeNode != null) {
            int left = getDepth(treeNode.left) + 1;
            int right = getDepth(treeNode.right) + 1;
            return left > right ? left : right;
        }
        return 0;
    }
}
