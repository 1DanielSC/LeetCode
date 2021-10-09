class Solution {
  
    //Time Complexity: O(n)
    //Space Complexity: O(1)
  
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        
        if(fun(root))
            root = null;
            
        
        return root;
    }
    
    public boolean fun(TreeNode root){
        if(root == null){
            return true;
        }
        
        if(fun(root.left)){
            root.left = null;
        }
        if(fun(root.right)){
            root.right = null;
        }
        
        if(root.left == null && root.right == null && root.val == 0){
            root = null;
            return true;
        }
        
        return false;
        
    }
   
}
