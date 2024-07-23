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
//Sum Root to Leaf Numbers 129 leetcode problem solution
class Solution {
    
    public static int travers(TreeNode root,int sum){
        if(root==null)return 0;
        sum =sum*10+root.val; 
        if(root.left==null && root.right==null)return sum ;
        int left = travers(root.left,sum);
        int right = travers(root.right,sum);
        return left+right;
    }
    public int sumNumbers(TreeNode root) { 
        return travers(root,0);
        
    }
}