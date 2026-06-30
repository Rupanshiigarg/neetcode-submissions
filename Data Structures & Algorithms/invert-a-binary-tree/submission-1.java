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
    public void pre(TreeNode ro){
        if(ro == null){
            return;
        }

        TreeNode temp = ro.left;
        ro.left = ro.right;
        ro.right = temp;

        pre(ro.left);
        pre(ro.right);
    }

    public TreeNode invertTree(TreeNode ro) {
        pre(ro);
        return ro;
    }
}