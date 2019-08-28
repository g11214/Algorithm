package solution;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class PrintTreeByFloor {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrFloorList = new ArrayList<>();
        ArrayList<Integer> arrFloor = new ArrayList<>();
        if(pRoot==null){
            return arrFloorList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        //当前层数量
        int floorCount = 1;
        //下层数量
        int floorNextCount = 0;
        //当前层索引
        int floorIndex = 0;

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            floorIndex++;
            arrFloor.add(tempNode.val);
            if (tempNode.left != null) {
                queue.offer(tempNode.left);
                floorNextCount++;
            }
            if (tempNode.right != null) {
                queue.offer(tempNode.right);
                floorNextCount++;
            }
            //当前层结束
            if (floorIndex == floorCount) {
                floorCount = floorNextCount;
                floorIndex = 0;
                floorNextCount = 0;
                arrFloorList.add(arrFloor);
                arrFloor = new ArrayList<>();
            }
        }
        return arrFloorList;
    }
}
