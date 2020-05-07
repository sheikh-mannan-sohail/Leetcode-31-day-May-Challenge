
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
            
           return bfs(root,x,y);
        
        }
    
    boolean bfs(TreeNode root,int x , int y){
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int n = queue.size();
            boolean found_x = false,found_y = false;
            
            for(int i=0;i<n;i++){
                TreeNode current_node = queue.remove();
                
                if(current_node.left!=null && current_node.right!=null && (current_node.left.val == x && current_node.right.val == y || current_node.left.val == y && current_node.right.val == x)) return false;
                
                if(current_node.left!=null && current_node.left.val == x ) found_x = true;
                else if (current_node.left!=null && current_node.left.val == y)found_y = true;
            
                
                if(current_node.right!=null && current_node.right.val == x ) found_x = true;
                else if (current_node.right!=null && current_node.right.val == y)found_y = true;
                
                if(current_node.left!=null)queue.add(current_node.left);
                if(current_node.right!= null)queue.add(current_node.right);
                
                
            }
            if(found_x == true && found_y == true)return true;
            if(found_x == true || found_y == true)return false;
            
        }
        
       return false;
    }
        
    }
