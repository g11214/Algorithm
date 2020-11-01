package SwordToOffer.Node;

import common.TreeNode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/17 17:23
 * @description：
 * @version: $
 */
public class KthNode {
    public static int solution(TreeNode root, int k) {
        if (root != null) {
            solution(root.right, k);
            k--;
            if (k == 0) {
                return root.val;
            }
            solution(root.left, k);
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(2);
        solution(node, 1);
    }
}
