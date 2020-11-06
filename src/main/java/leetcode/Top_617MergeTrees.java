package leetcode;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-12 21:04
 */
public class Top_617MergeTrees {
    public TreeNode solution(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else {
            if (t1 == null) {
                return t2;
            } else if (t2 == null) {
                return t1;
            } else {
                TreeNode resNode = new TreeNode(t1.val + t2.val);
                resNode.left = solution(t1.left, t2.left);
                resNode.right = solution(t1.right, t2.right);
                return resNode;
            }
        }
    }

    public static TreeNode solution2(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        TreeNode resNode = new TreeNode(1);
        merge(queue, queue1, queue2, t1, t2, resNode);

        while (!queue.isEmpty()) {
            TreeNode currResNode = queue.poll();
            TreeNode t1Node = queue1.poll();
            TreeNode t2Node = queue2.poll();

            if (currResNode == null) {
                continue;
            }
            currResNode.left = merge(queue, queue1, queue2, t1Node.left, t2Node.left, currResNode.left);
            currResNode.right = merge(queue, queue1, queue2, t1Node.right, t2Node.right, currResNode.right);
        }
        return resNode;
    }

    public static TreeNode merge(Queue queue, Queue queue1, Queue queue2, TreeNode t1Node, TreeNode t2Node, TreeNode currResNode) {
        //当前节点不为空
        if (t1Node == null && t2Node == null) {
            return null;
        } else {
            if (t1Node == null) {
                return t2Node;
            } else if (t2Node == null) {
                return t1Node;
            } else {
                //两颗树同时不为空，有一棵树为空则不用加入队列中
                currResNode = new TreeNode(t1Node.val + t2Node.val);
                queue.offer(currResNode);
                queue1.offer(t1Node);
                queue2.offer(t2Node);
                return currResNode;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        solution2(t1, t2);
    }
}
