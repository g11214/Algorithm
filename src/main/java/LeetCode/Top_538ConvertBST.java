package LeetCode;

import common.TreeNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/13 17:14
 * @description： 给定一个二叉搜索树（Binary Search Tree），
 * 把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * <p>
 * 例如：
 * <p>
 * 输入: 原始二叉搜索树:
 * 5
 * /   \
 * 2     13
 * <p>
 * 输出: 转换为累加树:
 * 18
 * /   \
 * 20     13
 * @version: $
 */
public class Top_538ConvertBST {
    int sum = 0;

    public TreeNode solution(TreeNode root) {
        if (root != null) {
            solution(root.right);
            int currVal = root.val;
            root.val = sum + currVal;
            sum = root.val;
            solution(root.left);
        }
        return root;
    }
}
