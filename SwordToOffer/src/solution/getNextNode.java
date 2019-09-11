package solution;

import common.TreeLinkNode;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/11 11:15
 * @description：给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * @version: $
 */
public class getNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {//不为空，则遍历其左子树
            return GetNext1(pNode.right);
        } else {//为空，返回上个节点
            //1.为上个节点的左子树
            //2.为上个节点的右子树
            return isSubLeftTree(pNode);
        }
    }
    /**
    * @Description: 中序遍历去下个节点
    * @Param: [pNode]
    * @Return: common.TreeLinkNode
    * @Date: 2019/9/11
    **/
    public TreeLinkNode GetNext1(TreeLinkNode pNode) {
        if (pNode.left != null) {//不为空，则遍历下一个左节点
            GetNext(pNode.left);
        }
        return pNode;
    }
    /**
    * @Description: 是否为父节点的左子树
    * @Param: [pNode]
    * @Return: common.TreeLinkNode
    * @Date: 2019/9/11
    **/
    public TreeLinkNode isSubLeftTree(TreeLinkNode pNode){
        if(pNode.next.left==pNode){
            return pNode.next;
        }else{
            return isSubLeftTree(pNode.next);
        }
    }
}
