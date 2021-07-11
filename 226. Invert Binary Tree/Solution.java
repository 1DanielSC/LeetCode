class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
      //Node "root" is a left, so there is nothing to be inverted
        if(root.left == null && root.right == null)
            return root;
        
        //Swap between the two root's children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}
