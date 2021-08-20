class Solution {
  
    //Time Complexity: O(h), where h stands for tree's height
        //If the BST is balanced, then h = log n
        //Otherwise, h = n
  
    //Space Complexity: O(1)
  
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return 0;
        
        return preOrder(root,low,high,0);
    }
    
    public int preOrder(TreeNode root, int low, int high, int sum){
        if(root == null)
            return sum;
      
        //We'll check its left subtree to achieve lower values
        if(root.val > high)
            sum = preOrder(root.left,low,high,sum);
        
        //We'll check its right subtree to achieve higher values
        if(root.val < low)
            sum = preOrder(root.right,low,high,sum);
        
        
        if(root.val >= low && root.val <= high){
            sum += root.val;
            sum = preOrder(root.left,low,high,sum);
            sum = preOrder(root.right,low,high,sum);
        }
        
        return sum;
    }
}
