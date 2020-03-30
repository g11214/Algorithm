package solution.Tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/11 14:16
 * @description：二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，从而使得内存中建立起来的二叉树可以持久保存。序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。  二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 * @version: $
 */
public class SerializeTree {
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }else{
            return null;
        }

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();

            if (tempNode != null) {
                sb.append(tempNode.val).append('!');

                if (tempNode.left != null) {
                    queue.offer(tempNode.left);
                } else {
                    queue.offer(null);
                }
                if (tempNode.right != null) {
                    queue.offer(tempNode.right);
                } else {
                    queue.offer(null);
                }
            } else {
                sb.append('#');
            }
        }
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        StringBuffer sb = new StringBuffer(str);
        ArrayList<TreeNode> arr = new ArrayList<>();

        int tempIndex = 0;
        //上个截取字符串的点
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '!') {
                arr.add(new TreeNode(Integer.parseInt(sb.substring(tempIndex, i))));
                tempIndex = i + 1;
            } else if (sb.charAt(i) == '#') {
                arr.add(null);
                tempIndex = i + 1;
            }
        }
        int currIndex = 0;
        int childIndex = 1;
        while (childIndex < arr.size()) {
            TreeNode tempNode = arr.get(currIndex);
            if(tempNode !=null){
                tempNode.left = arr.get(childIndex);
                childIndex++;
                tempNode.right = arr.get(childIndex);
                childIndex++;
            }

            currIndex++;
        }
        return arr.get(0);
    }
}
