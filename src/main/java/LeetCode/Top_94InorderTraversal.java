package LeetCode;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/1 15:48
 * @description： 给定一个二叉树，返回它的中序 遍历。
 * @version: $
 */
public class Top_94InorderTraversal {
    public List<Integer> solution(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            List<Integer> leftList = solution(root.left);
            list.addAll(leftList);
            list.add(root.val);
            List<Integer> rightList = solution(root.right);
            list.addAll(rightList);
        }
        return list;
    }

    /**
     * @Description: TODO
     * @Param: [root]
     * @Return: java.util.List<java.lang.Integer>
     * @Date: 2020/4/1
     **/
    public List<Integer> solution1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
