package leetcode;

import common.TreeNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/16 12:23
 * @description： 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * <p>
 *  
 * <p>
 * 示例 :
 * 给定二叉树
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 * @version: $
 */
public class Top_543DiameterOfBinaryTree {
    int count = 0;

    public int solution(TreeNode root) {
        dfs(root);
        return count;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftLen = dfs(root.left);
            int rightLen = dfs(root.right);
            count = Math.max(count, leftLen + rightLen);
            return Math.max(leftLen, rightLen) + 1;
        }
    }
}
