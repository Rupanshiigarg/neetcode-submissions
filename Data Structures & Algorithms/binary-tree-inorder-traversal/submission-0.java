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

    public List<Integer> in(TreeNode root){
        List<Integer> l = new ArrayList<>();

        if(root == null){
            return l;
        }

        l.addAll(in(root.left));
        l.add(root.val);
        l.addAll(in(root.right));

        return l;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return in(root);
    }
}