package leetcode;

import common.TreeNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/14 8:33
 * @description： 给定一个二叉树，它的每个结点都存放着一个整数值。
 * <p>
 * 找出路径和等于给定数值的路径总数。
 * <p>
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * <p>
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 * <p>
 * 示例：
 * <p>
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 * <p>
 * 10
 * /  \
 * 5   -3
 * / \    \
 * 3   2   11
 * / \   \
 * 3  -2   1
 * <p>
 * 返回 3。和等于 8 的路径有:
 * <p>
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3.  -3 -> 11
 * @version: $
 */
public class Top_437PathSum {
    int count = 0;

    public int solution(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum(root, sum);
        solution(root.left, sum);
        solution(root.right, sum);
        return count;
    }

    public void sum(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum -= root.val;
        if (sum == 0) {
            count++;
        }
        sum(root.left, sum);
        sum(root.right, sum);
    }
}
