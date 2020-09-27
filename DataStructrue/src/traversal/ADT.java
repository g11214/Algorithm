package traversal;

import common.TreeNode;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/12 9:46
 * @description：二叉查找树或二叉搜索树的方法
 * @version: $
 */
public class ADT {
    TreeNode root;

    ADT(TreeNode root) {
        this.root = null;
    }

    /**
     * @Description: 树的查找, 查找树的特点：左子树小，右子树大
     * @Param: target
     * @Return: boolean
     * @Date: 2019/9/12
     **/
    public boolean contains(int target, TreeNode root) {
        if (root != null) {
            if (target == root.val) {
                return true;
            } else if (target > root.val) {
                return contains(target, root.right);
            } else if (target < root.val) {
                return contains(target, root.left);
            }
        }
        return false;
    }

    /**
     * @Description: 是否为空，返回true为空
     * @Param: []
     * @Return: boolean
     * @Date: 2019/9/12
     **/
    public boolean isEmpty(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Description: 找出树中的最小值
     * @Param: []
     * @Return: T
     * @Date: 2019/9/12
     **/
    public int findMin(TreeNode root) {
        if (root.left != null) {
            return findMin(root.left);
        } else {
            return root.val;
        }
    }

    /**
     * @Description: 找出树中的最大值
     * @Param: []
     * @Return: T
     * @Date: 2019/9/12
     **/
    public int findMax(TreeNode root) {
        if (root.right != null) {
            return findMin(root.right);
        } else {
            return root.val;
        }
    }

    /**
     * @Description: 二叉搜索树的插入，并保持顺序
     * @Param: target
     * @Return: void
     * @Date: 2019/9/12
     **/
    public void insert(int target, TreeNode root, TreeNode lastNode, int loca) {
        if (root != null) {
            if (target == root.val) {
            } else if (target > root.val) {
                insert(target, root.right, root, 0);
            } else if (target < root.val) {
                insert(target, root.left, root, 1);
            }
        } else {
            TreeNode tempNode = new TreeNode(target);
            if (loca == 1) {//1为上个节点的右节点
                lastNode.left = tempNode;
            } else if (loca == 0) {
                lastNode.right = tempNode;
            }
        }
    }

    /**
     * @Description: 删除节点并保持顺序
     * @Param: target
     * @Return: void
     * @Date: 2019/9/12
     **/
    public void remove(int target, TreeNode root) {
        if (root != null) {
            if (target == root.val) {

            } else if (target > root.val) {
                remove(target, root.right);
            } else if (target < root.val) {
                remove(target, root.left);
            }
        } else {
            return;
        }
    }

    public TreeNode findLeft(TreeNode root){
        if(root.left != null){
            return findLeft(root.left);
        }else{
            return root;
        }
    }
}
