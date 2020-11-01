package SwordToOffer.Tree;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 操作给定的二叉树，将其变换为源二叉树的镜像。二叉树的镜像定义：源二叉树
 * 8
 * /  \
 * 6   10
 * / \  / \
 * 5  7 9 11
 * 镜像二叉树
 * 8
 * /  \
 * 10   6
 * / \  / \
 * 11 9 7  5
 * @author: Tong
 * @date: 2020-03-23 19:50
 */
public class MirrorTree {
    public void solution(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();

            TreeNode currNodeLeft = currNode.left;
            TreeNode currNodeRight = currNode.right;

            if (currNodeLeft != null) {
                queue.offer(currNodeLeft);
            }
            if (currNodeRight != null) {
                queue.offer(currNodeRight);
            }
            //交换
            currNode.left = currNodeRight;
            currNode.right = currNodeLeft;
        }
    }

    public void solution1(TreeNode node) {
        if (node != null) {
            TreeNode currNodeLeft = node.left;
            TreeNode currNodeRight = node.right;
            //交换
            node.left = currNodeRight;
            node.right = currNodeLeft;
            solution1(node.left);
            solution1(node.right);
        }
    }
}
