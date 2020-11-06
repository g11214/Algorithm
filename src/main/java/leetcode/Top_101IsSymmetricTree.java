package leetcode;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/15 14:17
 * @description： 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 *  
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 *  
 * <p>
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * @version: $
 */
public class Top_101IsSymmetricTree {
    public boolean solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else {
            if (left == null || right == null) {
                return false;
            } else {
                if (left.val == right.val) {
                    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
                } else {
                    return false;
                }
            }
        }
    }

    /**
     * @Description: 迭代
     * @Param: [root]
     * @Return: boolean
     * @Date: 2020/4/15
     **/
    public boolean solution2(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root);
        queue2.offer(root);
        while (!queue1.isEmpty()) {
            TreeNode left = queue1.poll();
            TreeNode right = queue2.poll();
            if (left == null && right == null) {
                continue;
            } else {
                if (left == null || right == null) {
                    return false;
                } else {
                    if (left.val == right.val) {
                        queue1.offer(left.left);
                        queue1.offer(left.right);
                        queue2.offer(right.right);
                        queue2.offer(right.left);
                    } else {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
