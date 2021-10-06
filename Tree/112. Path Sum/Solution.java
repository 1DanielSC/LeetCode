class Solution {
  
    //Time Complexity: O(n)
    //Space Complexity: O(1)
  
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        return traverseSum(root, targetSum,0);
    }
    
    private boolean traverseSum (TreeNode root, int target, int sum){
        
        //The parent of this node is not a child node
        if(root == null)
            return false;

        
        if(Solution.isChild(root)){
            if(target == sum + root.val)
                return true;
            else 
                return false;
        }
        else{
            //The current node isn't a child node
                //Hence, either root.left or root.right can be null
            if(traverseSum(root.left, target, sum + root.val))
                return true;
            if(traverseSum(root.right, target,sum + root.val))
                return true;
        }
        return false;
        //return traverseSum(root.left, target, sum + root.val) || traverseSum(root.right, target,sum + root.val); --> line 25 ~ 33
            //I don't know why but using the code line above is slower in runtime and consumes more memory (it doesn't give 100% in LeetCode).
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
