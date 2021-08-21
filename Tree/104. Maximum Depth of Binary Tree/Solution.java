class Solution {
  
    //Time Complexity: O(n)
    //Time Complexity: O(1)
  
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return maxDepth(root,0);
    }
    
    public int maxDepth(TreeNode root, int depth){
        if(root == null)
            return depth;
      
        depth += 1;
      
        //Each subtree will have a specific depth
        //Therefore, all we need to do is storing their depths and compare
      
        int depthLeft = maxDepth(root.left,depth);
        int depthRight = maxDepth(root.right,depth);
        
        return Math.max(depthLeft,depthRight);
    }
}
