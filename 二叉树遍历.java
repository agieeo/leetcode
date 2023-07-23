//二叉树前，中，后序的递归遍历
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        order(root, res);
        return res;
    }
    public void preorder(TreeNode root, List<Integer> res){
        if(root == null){
            return ;
        }
        res.add(root.val);
        order(root.left, res);

        order(root.right, res);
    }
    public void inorder(TreeNode root, List<Integer> res){
        if(root == null){
            return ;
        }

        order(root.left, res);
        res.add(root.val);
        order(root.right, res);
    }
    public void postorder(TreeNode root, List<Integer> res){
        if(root == null){
            return ;
        }

        order(root.left, res);
        order(root.right, res);
        res.add(root.val);
    }

}