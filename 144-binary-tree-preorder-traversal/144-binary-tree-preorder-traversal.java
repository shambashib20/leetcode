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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        return helper(root,list);
    }
    public List<Integer> helper(TreeNode root,List<Integer> list){
        list.add(root.val);
        if(root.left!=null)
            helper(root.left,list);
        if(root.right!=null)
            helper(root.right,list);
        return list;
    }
}