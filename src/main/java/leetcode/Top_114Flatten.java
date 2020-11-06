package leetcode;

import common.TreeNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/20 13:14
 * @description：
 * @version: $
 */
public class Top_114Flatten {
    TreeNode pre = null;

    public void solution(TreeNode root) {
        dfs(root);
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        dfs(root.left);
        if (pre != null) {
            root.right = pre;
            root.left = null;
        }
        pre = root;
    }
}
