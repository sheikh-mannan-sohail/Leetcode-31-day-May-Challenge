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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return create_bst(preorder,0,preorder.length-1);
        
    }
    
    TreeNode create_bst(int[] preorder,int l,int  r)
    {
        
        if(l>r)return null;
        
        TreeNode root = null;
        if(l==r){
            root = new  TreeNode(preorder[l]);
            return root;
        }
        
        root = new TreeNode(preorder[l]);
        
        int i;
        
        
        for( i=l+1;i<=r;i++){
            if(preorder[i] >   preorder[l])break;
        }
        
        root.left = create_bst(preorder,l+1,i-1);
        root.right =  create_bst(preorder, i,r);
        
        
        return root;
    }
    
}