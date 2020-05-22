package solution.Tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/21 10:17
 * @description：
 * @version: $
 */
public class PathSum {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root,sum,new ArrayList<>());
        return resList;
    }
    public void dfs(TreeNode root, int sum,List<Integer> currList){
        if(root != null){
            currList.add(root.val);
            if(sum == root.val && root.left == null && root.right == null){
                List<Integer> tempList = new ArrayList<>(currList);
                resList.add(tempList);
            }

            dfs(root.left, sum - root.val, currList);
            dfs(root.right, sum - root.val, currList);
            currList.remove(currList.size()-1);
        } else{
            return;
        }
    }

    public static void main(String[] args) {
        PathSum pathSum = new PathSum();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        pathSum.pathSum(root,22);
    }
}
