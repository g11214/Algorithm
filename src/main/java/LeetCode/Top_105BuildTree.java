package LeetCode;

import common.TreeNode;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-20 22:03
 */
public class Top_105BuildTree {
    public TreeNode solution(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int preStartIndex, int preEndIndex, int inStartIndex, int inEndIndex) {
        if (preStartIndex > preEndIndex || inStartIndex > inEndIndex) {
            return null;
        }

        int currNum = preorder[preStartIndex];
        TreeNode currNode = new TreeNode(currNum);
        int i = inStartIndex;
        for (; i <= inEndIndex; i++) {
            if (inorder[i] == currNum) {
                break;
            }
        }
        //i为当前节点在中序遍历中的位置
        currNode.left = build(preorder, inorder, preStartIndex + 1, preStartIndex + i - inStartIndex, inStartIndex, i - 1);
        currNode.right = build(preorder, inorder, preStartIndex + i - inStartIndex + 1, preEndIndex, i + 1, inEndIndex);
        return currNode;
    }
}
