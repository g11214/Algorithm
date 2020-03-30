package solution.Tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/11 13:57
 * @description：请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 * @version: $
 */
public class ZhiPrintTree {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
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
        //当前层数
        int floorNum = 1;

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();

            floorIndex++;
            if(floorNum%2!=0){
                arrFloor.add(tempNode.val);
            }else{
                arrFloor.add(0,tempNode.val);
            }

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
                floorNum++;
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
