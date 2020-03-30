package solution.Tree;

import common.TreeNode;
import java.util.ArrayList;

/**
 *输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class TargetEqualsBinaryTreePath {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
        ArrayList<Integer> subList = new ArrayList<>();
        if(root==null){
            return pathList;
        }
        getPath(root,target,subList,pathList);
        return pathList;
    }
    public void getPath(TreeNode root, int target, ArrayList<Integer> subList,ArrayList<ArrayList<Integer>> pathList) {
        if(root.left==null&&root.right==null){
            if(target==root.val){
                subList.add(root.val);
                pathList.add(subList);
            }
            return;
        }
        ArrayList<Integer> newSubList = new ArrayList<>();
        subList.add(root.val);
        newSubList.addAll(subList);

        if(root.left!=null){
            getPath(root.left,target-root.val,subList,pathList);
        }
        if(root.right!=null){
            getPath(root.right,target-root.val,newSubList,pathList);
        }
    }
}
