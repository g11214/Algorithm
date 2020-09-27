package traversal;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FloorOrder {
    public void floorOrder (TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            System.out.println(tempNode.val);
            if(tempNode.left!=null){
                queue.offer(tempNode.left);
            }
            if(tempNode.right!=null){
                queue.offer(tempNode.right);
            }
        }
    }
}
