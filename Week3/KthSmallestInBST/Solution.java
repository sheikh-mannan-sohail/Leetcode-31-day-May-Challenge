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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)return 0;
        int  res = iterative_inorder(root,k);
        return  res;
    }
    
    static int iterative_inorder(TreeNode root,int k){
        
        TreeNode curr=root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        while(!s.empty() ||  curr!=null)
        {
            while(curr!=null)
            {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            if(k-- == 1) break;
            curr=curr.right;
        }
        
        return curr.val;
    }
    
}