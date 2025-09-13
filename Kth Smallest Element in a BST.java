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
    int index=0;
    int value=-1;
    public int kthSmallest(TreeNode root, int k) {
        inOrderHelper(root,k);
        return value;
    }
    private void inOrderHelper(TreeNode root,int k){
        if(root==null){
            return;
        }
        inOrderHelper(root.left,k);
            index++;
            if(index==k){
                value= root.val;
                return;
            }
        inOrderHelper(root.right,k);
    }
}
