class ImprovedSolution {
    
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        
        if(ImprovedSolution.isChild(root) && targetSum == root.val)
            return true;
        
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
   
    private static boolean isChild(TreeNode node){
        if(node == null)
            return false;
        else if(node.left == null && node.right == null)
            return true;
        else
            return false;
    }
}
