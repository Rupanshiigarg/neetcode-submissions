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
    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        int max = Math.max(maxDepth(root.left),maxDepth(root.right));
        return 1+max;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
       int    maxLeft = maxDepth(root.left);
           int maxRight = maxDepth(root.right);
         int ans = (maxLeft + maxRight);
         int sub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
         return Math.max(ans, sub);
    }
        

    
}
