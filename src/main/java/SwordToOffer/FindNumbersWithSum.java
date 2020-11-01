package SwordToOffer;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/5 15:23
 * @description：输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @version: $
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            int target = sum - array[i];
            int mid = Arrays.binarySearch(array, i + 1, array.length, target);
            if (mid < 0) {
                continue;
            } else {
                arrayList.add(array[i]);
                arrayList.add(target);
                break;
            }
        }
        return arrayList;
    }

    /**
     * @author ：Tong
     * @date ：Created in 2019/9/11 16:47
     * @description：给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
     * @version: $
     */
    public static class KthNode {

        TreeNode kthNode(TreeNode pRoot, int k) {
            Stack<TreeNode> stack = new Stack();
            stack.push(pRoot);
            TreeNode tempNode = pRoot;
            int index = 0;
            while (!stack.isEmpty() && pRoot != null) {
                while (tempNode.left != null) {
                    stack.push(tempNode.left);
                    tempNode = tempNode.left;
                }
                tempNode = stack.pop();
                index++;
                if (k == index) {
                    return tempNode;
                }

                if (tempNode.right != null) {
                    stack.push(tempNode.right);
                    tempNode = tempNode.right;
                } else {
                    tempNode.left = null;
                }
            }
            return null;
        }
    }
}
