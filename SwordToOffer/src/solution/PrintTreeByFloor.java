package solution;

import common.TreeNode;
import java.util.ArrayList;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class PrintTreeByFloor {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> floorList = new ArrayList<>();

        int floorIndex = 0;
        int nextFloorCount = 0;

        while(pRoot!=null){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(pRoot.val);

            if(pRoot.left!=null){
                list.add(pRoot.val);
                floorIndex++;
            }
            if(pRoot.right!=null){
                list.add(pRoot.val);
                floorIndex++;
            }
            if(floorIndex==nextFloorCount){
                nextFloorCount=floorIndex;
                floorIndex = 0;
                floorList.add(list);
            }
        }

        return floorList;
    }
}
